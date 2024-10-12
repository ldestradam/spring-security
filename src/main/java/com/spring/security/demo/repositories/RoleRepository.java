package com.spring.security.demo.repositories;

import com.spring.security.demo.models.AppRole;
import com.spring.security.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(AppRole appRole);

}
