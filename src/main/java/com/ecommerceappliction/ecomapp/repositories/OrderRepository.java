package com.ecommerceappliction.ecomapp.repositories;

import com.ecommerceappliction.ecomapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}