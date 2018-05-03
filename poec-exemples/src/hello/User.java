package hello;

import java.net.URL;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private URL url_avatar;
    
 
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public URL getUrl_avatar() {
 		return url_avatar;
 	}
 	public void setUrl_avatar(URL url_avatar) {
 		this.url_avatar = url_avatar;
 	}
    
    @Override
    public String toString() {
        return "[id: " + id +
                ", username: " + username +
                ", password: " + password +
                ", email: " + email + 
                ",avatar: " + url_avatar +
                "]";
    }
    
    
    
}