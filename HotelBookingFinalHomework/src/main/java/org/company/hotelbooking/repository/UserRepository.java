package org.company.hotelbooking.repository;

import org.company.hotelbooking.model.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    User findById(int id);

}
