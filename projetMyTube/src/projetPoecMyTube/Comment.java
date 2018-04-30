package projetPoecMyTube;

import java.util.Date;

public class Comment {
	private Integer id;
	private String text;
	private Integer video_id;
	private Integer user_id;
	private Date date_publication;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Date getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}
	   @Override
	    public String toString() {
	        return "[id: " + id +
	                ", comment: " + text +
	                ", video_id: " + video_id +
	                ", user_id: " + user_id + 
	                ", date_publication: " + date_publication +
	                "]";
	    }
}

