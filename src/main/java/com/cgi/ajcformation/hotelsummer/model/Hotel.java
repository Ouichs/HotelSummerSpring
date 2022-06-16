package com.cgi.ajcformation.hotelsummer.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


   @OneToMany
   private Collection<BedRoom> bedrooms = new ArrayList<>();

   @OneToOne
   private Adress adress;



	private String name;
	private String description;
	private String pictures;
	private double noteUser;
	private int starsNotation;

	// private BedRoom bedRoom;
	// private Adress adress;
	// private Service service;
	// private Picture picture;

	@Version
	private int version;



}
