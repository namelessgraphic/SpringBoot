package com.example.project.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.project.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
