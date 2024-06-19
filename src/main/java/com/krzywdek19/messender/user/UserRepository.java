package com.krzywdek19.messender.user;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    public Optional<User> findByEmail(String email);
}
