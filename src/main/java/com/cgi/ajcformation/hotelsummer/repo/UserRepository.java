package com.cgi.ajcformation.hotelsummer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cgi.ajcformation.hotelsummer.model.User;

// @RepositoryRestResource(collectionResourceRel = "users", path = "users")
@CrossOrigin
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByPasswordAndEmail(@Param("password") String password, @Param("email") String email);
}

//