package com.cgi.ajcformation.hotelsummer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bedroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private double price;
	private String pictures;
	private String typeBedroom;

	@Version
	private int version;

}
