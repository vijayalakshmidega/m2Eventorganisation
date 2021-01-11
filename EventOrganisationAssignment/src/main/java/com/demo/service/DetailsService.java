package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.repos.AppUser;
import com.demo.service.AppUserService;

@Service
public class DetailsService implements UserDetailsService{
	@Autowired
   private AppUserService appService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		AppUser appUser=appService.findByUserName(username);
		System.out.println(appUser);
		if(appUser==null)
			throw new UsernameNotFoundException("user with name was nit found");
		
		
		String[] roles=new String[appUser.getRoles().size()];
		appUser.getRoles().toArray(roles);
		User users=new User(appUser.getUserName(),appUser.getPassword(),
				AuthorityUtils.createAuthorityList(roles));
		return users;
	}

}
