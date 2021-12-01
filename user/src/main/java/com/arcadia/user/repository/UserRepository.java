package com.arcadia.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arcadia.user.model.User;

@RepositoryRestResource()
public interface UserRepository extends JpaRepository<User, Integer> {

	@Override
	public List<User> findAll();
}