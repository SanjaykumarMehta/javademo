package com.hexaware.service;

import java.util.List;

import com.hexaware.entity.User;

public interface UserService {
	public void createUser(User user);
    public List<User> getUser();
    public User findById(long id);
    public User update(User user, long l);
    public void deleteUserById(long id);
    public User updatePartially(User user, long id);   
    public List<User> findByNameOrIdOrCountry(User name);
}
