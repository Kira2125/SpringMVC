package com.example.sweater.Repository;

import com.example.sweater.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
