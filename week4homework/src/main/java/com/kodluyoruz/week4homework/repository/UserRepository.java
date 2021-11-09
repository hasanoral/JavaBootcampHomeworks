package com.kodluyoruz.week4homework.repository;

import com.kodluyoruz.week4homework.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByNameContains(String name);

    List<User> findAllByNameContainsOrDescriptionContains(String name,String description);
}

