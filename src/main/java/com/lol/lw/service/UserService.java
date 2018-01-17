package com.lol.lw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.lw.entity.User;

public interface UserService {
	public List<User> getUsers();
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
}
