package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VideoRepository {

	private Video mapResultSetToVideo(ResultSet rsVideo, ResultSet rsUser, ResultSet rsComment) throws SQLException {

		Video v = new Video();
		v.setId(rsVideo.getInt("id"));
		v.setTitle(rsVideo.getString("title"));
		v.setDescription(rsVideo.getString("description"));
		v.setDuration(rsVideo.getInt("duration"));
		v.setPublicationDate(rsVideo.getString("publicationDate"));
		v.setUrlVideo(rsVideo.getString("urlVideo"));
		v.setUrlMiniature(rsVideo.getString("urlMiniature"));
		
		User u = new User();
		u.setId(rsUser.getInt("id"));
		u.setUsername(rsUser.getString("username"));
		u.setPassword(rsUser.getString("password"));
		u.setEmail(rsUser.getString("email"));
		
		Comment c = new Comment();
		c.setId(rsComment.getInt("id"));
		c.setText(rsComment.getString("text"));
		c.setVideo_id(rsComment.getInt("video_id"));
		c.setUser_id(rsComment.getInt("comment_id"));
		c.setDate_publication(rsComment.getDate("date_publication"));
		
		

		v.setAuthor(u);
		v.setComment(c);

		return v;
	}

	public Video findVideoById(int id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC",
				"root", "rootroot")) {
			// fetch the video
			PreparedStatement pstmtVideo = conn.prepareStatement("SELECT * FROM video WHERE id = ?");
						pstmtVideo.setInt(1, id);
						
						ResultSet rsVideo = pstmtVideo.executeQuery();
						if(! rsVideo.next()) { 
							return null; 
						}
						
						// fetch the author of the video
						int authorId = rsVideo.getInt("id");
						
						PreparedStatement pstmtAuthor = conn.prepareStatement("SELECT * FROM user WHERE id = ?");
						pstmtAuthor.setInt(1, authorId);
						
						ResultSet rsAuthor = pstmtAuthor.executeQuery();
						if(! rsVideo.next()) { 
							throw new RuntimeException("Video has no author"); 
						}
						
						// fetch the comment of the video
						int commentId = rsVideo.getInt("id");
						
						PreparedStatement pstmtComment = conn.prepareStatement("SELECT * FROM commentaire WHERE id = ?");
						pstmtComment.setInt(1, commentId);
						
						ResultSet rsComment = pstmtComment.executeQuery();
						if(! rsComment.next()) { 
							throw new RuntimeException("Video has no comment"); 
						}
						
						return  mapResultSetToVideo(rsVideo, rsAuthor, rsComment);
						
					} catch (SQLException e) {
						throw new RuntimeException(e);
					}
	
	 }
	

	public List<Video> findAllVideo() {
		
	try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC","root", "rootroot")) {

	   Statement stmt = conn.createStatement();
	   ResultSet rs = stmt.executeQuery("SELECT * FROM video");
	
	   List<Video> videos = new ArrayList<>();
	
	   while (rs.next()) {
	   Video v = mapResultSetToVideo(rs, rs, rs);
	   videos.add(v);
	   }
	
	   return videos;
	
	 } catch (SQLException e) {
	 throw new RuntimeException(e);
	 }
	 

	}
}