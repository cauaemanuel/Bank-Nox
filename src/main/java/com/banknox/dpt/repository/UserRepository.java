package com.banknox.dpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banknox.dpt.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
