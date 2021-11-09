package com.kodluyoruz.week4homework.repository;

import com.kodluyoruz.week4homework.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByNameContains(String name);

    List<Product> findAllByNameContainsOrDescriptionContains(String name,String description);
}
