package com.example.emb.domain.user.domain.repository;

import com.example.emb.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUser_id(String user_id);

}
