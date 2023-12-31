package com.exam.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.portal.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

	Users findByUserName(String userName);

}
