package com.regression.repositories;

import com.regression.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by purushtoman on 7/6/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByRole(int role);
    List<User> findAll();
}
