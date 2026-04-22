package com.praktikumDB.praktikum7.repository;

import com.praktikumDB.praktikum7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

