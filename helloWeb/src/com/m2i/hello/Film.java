package com.m2i.hello;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="film")
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="film_id")
	private Short id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private Integer  releaseYear;
	
	@Column(name="language_id")
	private Short languageId;
	
	@Column(name="original_language_id")
	private Short originalLanguageId;
	
	@Column(name="rental_duration")
	private BigDecimal rentalDuration;
	
	@Column(name="rental_rate")
	private BigDecimal rentalRate;
	
	@Column(name="length")
	private Short length;
	
	@Column(name="replacement_cost")
	private BigDecimal replacementCost;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="special_features")
	private String specialFeatures;
	
	@Column(name="last_update")
	private Instant lastUpdate;

	@ManyToMany
	 @JoinTable(name = "film_actor", 
			 	joinColumns = @JoinColumn(name = "film_id"),
		        inverseJoinColumns = @JoinColumn(name = "actor_id"))
	private Set<Actor> actors = new HashSet<>();
	
	public Set<Actor> getActors() {
		return actors;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Short getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Short languageId) {
		this.languageId = languageId;
	}

	public Short getOriginalLanguageId() {
		return originalLanguageId;
	}

	public void setOriginalLanguageId(Short originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}

	public BigDecimal getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(BigDecimal rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public BigDecimal getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Short getLength() {
		return length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	public BigDecimal getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
