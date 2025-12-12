package com.ecommerceappliction.ecomapp.repositories;


import com.ecommerceappliction.ecomapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}