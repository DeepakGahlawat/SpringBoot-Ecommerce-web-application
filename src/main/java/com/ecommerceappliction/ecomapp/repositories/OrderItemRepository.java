package com.ecommerceappliction.ecomapp.repositories;


import com.ecommerceappliction.ecomapp.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
