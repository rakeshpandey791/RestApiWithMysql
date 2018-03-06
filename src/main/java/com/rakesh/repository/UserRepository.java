package com.rakesh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<List<User>> findByName(String name);

}
