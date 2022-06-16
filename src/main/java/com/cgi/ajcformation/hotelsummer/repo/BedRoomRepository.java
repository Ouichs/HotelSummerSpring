package com.cgi.ajcformation.hotelsummer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cgi.ajcformation.hotelsummer.model.BedRoom;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "bedroom", path = "bedroom")
public interface BedRoomRepository extends JpaRepository<BedRoom, Integer> {
//findbyidandhotelid
}
