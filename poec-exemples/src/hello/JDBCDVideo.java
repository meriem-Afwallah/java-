package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import projetPoecMyTube.User;
import projetPoecMyTube.Video;

public class JDBCDVideo {
	
	public static User mapResultSetToUser(ResultSet rs) throws SQLException  {
		User u = new User();
		u.setId(rs.getInt("id")); 
		u.setUsername(rs.getString("username")); 
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));

		return u;
	}
	public static Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
		Video v = new Video();
		v.setId(rs.getInt("id")); 
		v.setTitle(rs.getString("title"));
		v.setDescription(rs.getString("description"));
		v.setDuration(rs.getInt("duration"));
		v.setPublicationDate(rs.getString("publicationDate"));
		v.setUrlVideo(rs.getString("urlVideo"));
		v.setUrlMiniature(rs.getString("urlMiniature"));

		return v;
	}
	public static void main(String[] args) {
		VideoRepository videoRepo = new VideoRepository();
		VideoRepository userRepo = new VideoRepository();
		
		
		
//		Video v1 = videoRepo.findVideoById(1);
//		System.out.println(v1);
//		Video v2 = videoRepo.findVideoById(2);
//		System.out.println(v2);
//		Video v3 = videoRepo.findVideoById(3);
//		System.out.println(v3);
//		Video v4 = videoRepo.findVideoById(4);
//		System.out.println(v4);

		List<Video> videos = videoRepo.findAllVideo();
		System.out.println(videos);
//		
//		List<User> users = userRepo.findAllUsers();
//		System.out.println(videos);
		
		
		
	
	}

}
