package com.cgi.ajcformation.hotelsummer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cgi.ajcformation.hotelsummer.model.Hotel;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "hotel", path = "hotel")
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	

}
