package com.mytube.domain.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="video")
public class Video {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="date_de_publication")
	private Date dateDePublication;
	
	@Column(name="description")
	private String description;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="url_video")
	private String urlVideo;
	
	@Column(name="url_video_miniature")
	private String urlVideoMiniature;
	
	@Column(name="duree")
	private Integer duree;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(Date dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getUrlVideoMiniature() {
		return urlVideoMiniature;
	}

	public void setUrlVideoMiniature(String urlVideoMiniature) {
		this.urlVideoMiniature = urlVideoMiniature;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	

}
