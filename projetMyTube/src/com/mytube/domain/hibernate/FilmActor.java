package com.mytube.domain.hibernate;

package hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="film_actor")
public class FilmActor implements Serializable {

    @Id
   @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="film_id",
                foreignKey=@ForeignKey(name ="fk_film_actor_film"))
   private Film film;

   @Id
   @ManyToOne(fetch=FetchType.LAZY)
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
