package com.study.springSecurityApp.dao;

import com.study.springSecurityApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
