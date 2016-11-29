package com.sermo.web.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author sermo
 * @version 2016/11/29.
 */
public interface UserRepository extends MongoRepository<User, String>{

    User findByUserName(String username);
}
