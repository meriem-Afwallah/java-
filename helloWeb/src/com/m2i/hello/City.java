package com.m2i.hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")

public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	
	private Short id;
	
	@Column(name="city")
	private String city;
	
	//@Column(name="country_id")
	//private Short countryId;
	
	@ManyToOne
	@JoinColumn(name="country_id", foreignKey=@ForeignKey(name="fk_city_country"))
	private Country country;
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	public Short getCountryId() {
//		return countryId;
//	}
//
//	public void setCountryId(Short countryId) {
//		this.countryId = countryId;
//	}
	

}
