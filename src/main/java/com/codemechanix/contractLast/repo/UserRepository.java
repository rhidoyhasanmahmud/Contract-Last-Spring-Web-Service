package com.codemechanix.contractLast.repo;

import com.codemechanix.contractLast.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByIdAndRemovalDateIsNull(Long id);
    Optional<User> findByEmail(String email);
}