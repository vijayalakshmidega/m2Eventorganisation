package com.demo.service;

import com.demo.repos.AppUser;
import java.util.*;
public interface AppUserService {

	public AppUser findByUserName(String username);
	public void addAppUser(AppUser user);
	public List<AppUser> getAllAppUsers();
}
