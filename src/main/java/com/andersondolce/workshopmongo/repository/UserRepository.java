package com.andersondolce.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andersondolce.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
