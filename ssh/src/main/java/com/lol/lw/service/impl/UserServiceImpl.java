package com.lol.lw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lol.lw.dao.UserDao;
import com.lol.lw.entity.User;
import com.lol.lw.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

  private UserDao userDao;

  public UserDao getUserDao() {
    return userDao;
  }

  @Autowired(required = true)
  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  } 

  public List<User> getUsers() {
    return userDao.getUsers();
  }

  public void saveUser(User user) {
    userDao.saveUsers(user);

  }

  public void updateUser(User user) {
    userDao.updateUser(user);

  }

  public void deleteUser(User user) {
    userDao.deleteUser(user);
    
  }

}
