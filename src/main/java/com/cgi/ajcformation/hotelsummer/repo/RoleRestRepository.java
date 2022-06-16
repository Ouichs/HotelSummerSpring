package com.cgi.ajcformation.hotelsummer.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cgi.ajcformation.hotelsummer.model.RoleRest;
import com.cgi.ajcformation.hotelsummer.model.RoleRestNames;

@RepositoryRestResource(collectionResourceRel = "roles", path = "roles"
// , exported = false
)
public interface RoleRestRepository extends JpaRepository<RoleRest, Long> {

    Optional<RoleRest> findByName(RoleRestNames name);

    Boolean existsByName(RoleRestNames name);

}
