package com.cgi.ajcformation.hotelsummer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Service {
	
	@Id
	private int id;
	private String description;
	private String name;
	private String pictures;
	
	
	@Version
    private int version;

}
