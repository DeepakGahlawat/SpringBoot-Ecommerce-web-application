package com.ecommerceappliction.ecomapp.repositories;
import com.ecommerceappliction.ecomapp.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}