package com.mytube.domain.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.m2i.hello.FilmActor;

@Entity
@Table(name="user")
public class User {
	
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="url_avatar")
	private String urlAvatar;
	
	@OneToMany(mappedBy = "video")
	private Set<Comment> filmactors = new HashSet<>();
	

}
