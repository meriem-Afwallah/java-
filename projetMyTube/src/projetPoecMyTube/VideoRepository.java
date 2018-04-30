package projetPoecMyTube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VideoRepository {

	private Video mapResultSetToVideo(ResultSet rs) throws SQLException {
		// maps the video
		Video v = new Video();
		v.setId(rs.getInt("id"));
		v.setTitle(rs.getString("title"));
		v.setDescription(rs.getString("description"));
		v.setDuration(rs.getInt("duration"));
		v.setPublicationDate(rs.getString("publicationDate"));
		v.setUrlVideo(rs.getString("urlVideo"));
		v.setUrlMiniature(rs.getString("url_video_miniature"));
		// maps the users
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));

		// maps the comments
		Comment c = new Comment();
		c.setId(rs.getInt("id"));
		c.setText(rs.getString("texte"));
		c.setVideo_id(rs.getInt("video_id"));
		c.setUser_id(rs.getInt("user_id"));
		c.setDate_publication(rs.getDate("date_publication"));

		v.setAuthor(u);
		v.setComment(c);

		return v;
	}

	public Video findById(int id) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

            // fetch the video
            PreparedStatement pstmt = 
                    conn.prepareStatement("SELECT video.id, video.user_id,video.title, video.publicationDate, \r\n" + 
                    		"		video.description, video.tags, video.urlVideo, video.url_video_miniature, video.duration,\r\n" + 
                    		"        user.id, user.username, user.password, user.email, user.url_avatar, commentaire.id, commentaire.texte, commentaire.video_id,\r\n" + 
                    		"        commentaire.user_id, commentaire.date_publication\r\n" + 
                    		"FROM video \r\n" + 
                    		"	INNER JOIN user\r\n" + 
                    		"		ON video.user_id=user.id\r\n" + 
                    		"	INNER JOIN commentaire\r\n" + 
                    		"		ON commentaire.video_id = video.id;");
            //pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if(! rs.next()) { 
                return null; 
            }
            
            return  mapResultSetToVideo(rs);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


	public List<Video> findAllVideo() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC",
				"root", "rootroot")) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT video.id, video.user_id,video.title, video.publicationDate, \r"
					+ "		video.description, video.tags, video.urlVideo, video.url_video_miniature, video.duration,\r"
					+ "        user.id, user.username, user.password, user.email, user.url_avatar, commentaire.id, commentaire.texte, commentaire.video_id,\r"
					+ "        commentaire.user_id, commentaire.date_publication\r" + "FROM user \r"
					+ "	INNER JOIN video\r" + "		ON video.user_id=user.id\r" + "	INNER JOIN commentaire\r"
					+ "		ON commentaire.video_id = video.id");

			List<Video> videos = new ArrayList<>();

			while (rs.next()) {
				Video v = mapResultSetToVideo(rs);

				videos.add(v);
			}

			return videos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
    
}
