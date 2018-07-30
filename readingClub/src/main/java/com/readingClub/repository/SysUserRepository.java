package com.readingClub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.readingClub.entity.sysUser;

public interface SysUserRepository extends JpaRepository<sysUser,Integer>{

	sysUser findByUsername(String username);

}
