package com.redisexample.SpringBootRedis.Service;

import java.util.List;

import com.redisexample.SpringBootRedis.Entity.User;

public interface IUserService {

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(int id);

    boolean deleteUser(int id);

    boolean updateUser(int id, User user);

}
