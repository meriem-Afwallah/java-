package com.m2i.hello;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {
	
	@Id	 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // pour le Auto Increment de MySQL
	@Column(name="actor_id")
	private Short id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="last_update")
	private Instant lastUpdate;

	@OneToMany(mappedBy = "actor")
	private Set<FilmActor> filmactors = new HashSet<>();
	
	public Set<FilmActor> getFilmactors() {
		return filmactors;
	}

//	@ManyToMany(mappedBy = "actors")
//    private Set<Film> films = new HashSet<>();
//	
//	public Set<Film> getFilms() {
//		return films;
//	}
	
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

}