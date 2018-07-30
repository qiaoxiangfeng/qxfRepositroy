package com.readingClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.readingClub.entity.sysUser;
import com.readingClub.repository.SysUserRepository;

public class CustomUserService implements UserDetailsService {
	@Autowired
	private SysUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		sysUser user=userRepository.findByUsername(username);
		if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
		System.out.println(user.getUsername()+""+user.getPassword());
		System.out.println("----------锁定状态是"+user.isAccountNonLocked());
		return user;
	}

}
