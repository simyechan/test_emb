package com.example.emb.domain.user.domain.repository;

import com.example.emb.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUser_id(String user_id);
}
