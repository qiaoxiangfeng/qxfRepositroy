package com.readingClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.readingClub.entity.User;
import com.readingClub.repository.UserRepository;

public class CustomUserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepository.findByUsername(username);
		if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
		System.out.println(username);
		System.out.println(user.getUsername()+""+user.getPassword());
		return user;
	}

}
