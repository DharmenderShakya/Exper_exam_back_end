package com.exam.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.portal.entity.Role;

@Repository
public interface RolesRepo extends JpaRepository<Role, Integer> {

}
