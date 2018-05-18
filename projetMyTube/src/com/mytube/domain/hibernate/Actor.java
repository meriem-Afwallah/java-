package com.mytube.domain.hibernate;


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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="actor_id")
    private Short id;
    
    @Column(name="first_name")
    private String firstname;
    
    @Column(name="last_name")
    private String lastname;
    
    @Column(name="last_update")
    private Instant lastUpdate;
    
    
    
    /*@ManyToMany(mappedBy = "actors")
   private Set<Film> films = new HashSet<>();*/
    
    
    @OneToMany(mappedBy = "actor")
    private Set<FilmActor> filmactors = new HashSet<>();
    
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

    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set<FilmActor> getFilmactors() {
        return filmactors;
    }

    public void setFilmactors(Set<FilmActor> filmactors) {
        this.filmactors = filmactors;
    }

    
    /*public Set<Film> getFilms() {
        return films;
    }*/

    /*public void setFilms(Set<Film> films) {
        this.films = films;
    }*/
    
    
    
}
