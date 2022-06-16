package com.cgi.ajcformation.hotelsummer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cgi.ajcformation.hotelsummer.model.UserRest;

@RepositoryRestResource(collectionResourceRel = "users", path = "users"
// , exported = false
)
@CrossOrigin
public interface UserRestRepository extends JpaRepository<UserRest, Integer> {

    Optional<UserRest> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    List<UserRest> findByPasswordAndEmail(@Param("password") String password, @Param("email") String email);
}

//
