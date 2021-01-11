package com.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer>{
	
	public AppUser findByUserName(String username);
	

}
