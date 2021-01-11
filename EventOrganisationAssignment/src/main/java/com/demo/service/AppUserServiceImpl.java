package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repos.AppUser;
import com.demo.repos.AppUserRepo;

@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUserRepo appUser;
	@Override
	public AppUser findByUserName(String username) {
		return appUser.findByUserName(username);
	}

	@Override
	public void addAppUser(AppUser user) {
     appUser.save(user);		
	}

	@Override
	public List<AppUser> getAllAppUsers() {
		return appUser.findAll();
	}

}
