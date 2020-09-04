package com.br.davifelipe.springjwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.br.davifelipe.springjwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Transactional(readOnly = true)
	public User findByEmail(@Param("email") String email);
}
