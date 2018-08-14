package com.tkd.ordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkd.ordering.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
