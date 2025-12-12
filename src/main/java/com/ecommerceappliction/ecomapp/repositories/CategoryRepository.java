package com.ecommerceappliction.ecomapp.repositories;



import com.ecommerceappliction.ecomapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
}
