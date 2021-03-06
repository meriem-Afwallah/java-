package com.mytube.domain.hibernate;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="commentaire")
public class Comment {
	
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="texte")
	private String text;
	
	@Id
    @ManyToOne
	@JoinColumn(name="video_id",
			    foreignKey=@ForeignKey(name ="fk_commentaire_video"))
    private Video video;

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",
    			foreignKey=@ForeignKey(name ="fk_commentaire_user"))
    private User user;
	
	@Column(name="date_publication")
	private Instant datePublication;

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

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Instant getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Instant datePublication) {
		this.datePublication = datePublication;
	}

}
