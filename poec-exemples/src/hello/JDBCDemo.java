package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class JDBCDemo {

	public static User mapResultSetToUser(ResultSet rs) throws SQLException  {
		User u = new User();
		u.setId(rs.getInt("id")); // ou rs.getInt(1)
		u.setUsername(rs.getString("username")); // ou rs.getInt(2)
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));

		return u;
	}
	
	public static void main(String[] args) {
		
		// Obtenir une connexion à votre base de données
//		Connection conn = null;
//		try {
//			conn = DriverManager.getConnection(
//								"jdbc:mysql://localhost:3306");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {		
//			// fermer la connexion
//			if(conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		// Java 7+ try-with-resource
		// appel automatique de la methode close de la resource Closeable (ici la connection)
//		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/poec?serverTimezone=UTC", "root", "rootroot")) {
//		
//			Statement stmt = conn.createStatement();
//			// stmt.executeQuery(sql) // SELECT
//			// stmt.executeUpdate(sql) // INSERT INTO, DELETE FROM, UPDATE
//			
//			ResultSet rs = stmt.executeQuery("SELECT * FROM user");
//			
//			// déplacer le curseur sur la prochaine ligne
//			// (ici la première ligne du résultat)
//			
//			Collection<User> users = new ArrayList<>();
//			
//			while(rs.next()) {			
//				User u = mapResultSetToUser(rs);
//				users.add(u);
//			}
//			
//			System.out.println(users);
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		UserRepository userRepo = new UserRepository();
//		List<User> users = userRepo.findAllUsers();
//		System.out.println(users);
		
		User u1 = userRepo.findUserById(1);
		System.out.println(u1);
		User u2 = userRepo.findUserById(2);
		System.out.println(u2);
		User u3 = userRepo.findUserById(3);
		System.out.println(u3);	
	}

}
