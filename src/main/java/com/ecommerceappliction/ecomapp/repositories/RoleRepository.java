package com.ecommerceappliction.ecomapp.repositories;


import com.ecommerceappliction.ecomapp.model.AppRole;
import com.ecommerceappliction.ecomapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}

