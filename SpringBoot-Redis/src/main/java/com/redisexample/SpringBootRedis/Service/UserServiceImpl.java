package com.redisexample.SpringBootRedis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redisexample.SpringBootRedis.Entity.User;
import com.redisexample.SpringBootRedis.Repository.IUserDao;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDao.fetchAllUser();
    }

    @Override
    public User fetchUserById(int id) {
        return userDao.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public boolean updateUser(int id, User user) {
        return userDao.updateUser(id, user);
    }
}
