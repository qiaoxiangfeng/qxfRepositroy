package com.readingClub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.readingClub.entity.User;

public interface UseRepository extends JpaRepository<User,Integer> {

}
