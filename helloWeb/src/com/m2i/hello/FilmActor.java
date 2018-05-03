package com.m2i.hello;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	
	@Entity
	@Table(name="film_actor")
	public class FilmActor implements Serializable {

		@Id
	    @ManyToOne
		@JoinColumn(name="film_id",
				    foreignKey=@ForeignKey(name ="fk_film_actor_film"))
	    private Film film;

	    @Id
	    @ManyToOne
		@JoinColumn(name="actor_id",
	    			foreignKey=@ForeignKey(name ="fk_film_actor_actor"))
	    private Actor actor;
	    
	    public Film getFilm() {
			return film;
		}
	    
	    public Actor getActor() {
			return actor;
		}
	}
