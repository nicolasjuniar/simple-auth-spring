package com.example.moneysaver;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<DAOUser, String> {
    DAOUser findByUsername(String username);
}
