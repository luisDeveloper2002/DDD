package edu.uptc.swii.usermgmt.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.uptc.swii.usermgmt.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ 'userId' : ?0 }")
    public User findByUserId(String userId);
}
