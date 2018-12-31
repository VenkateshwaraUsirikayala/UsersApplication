package com.application.users.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.users.model.User;

@Repository
public interface UsersDao extends CrudRepository<User, Long>{

}
