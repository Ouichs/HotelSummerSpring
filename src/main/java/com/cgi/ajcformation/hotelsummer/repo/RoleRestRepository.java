package com.cgi.ajcformation.hotelsummer.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.ajcformation.hotelsummer.model.RoleRest;

public interface RoleRestRepository extends JpaRepository<RoleRest, Long> {

    Optional<RoleRest> findByName(RoleRest name);

}
