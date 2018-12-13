package com.hexaware.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexaware.entity.User;
import com.hexaware.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImp.class);
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
    	logger.info("UserServiceImp: createUser :  "+user.toString());
        userRepository.save(user);
    }

    public List<User> getUser() {
    	logger.info("UserServiceImp: getUser");
        return (List<User>) userRepository.findAll();
    }

    public User findById(long id) {
    	logger.info("UserServiceImp: findById :  "+id);
        return userRepository.findOne(id);
    }

    public User update(User user, long id) {
    	logger.info("UserServiceImp: update :  "+user.toString()+ "ID:"+id);
        return userRepository.save(user);
    }

    public void deleteUserById(long id) {
    	logger.info("UserServiceImp: deleteUserById :  "+id);
        userRepository.delete(id);
    }

    public User updatePartially(User user, long id) {
    	logger.info("UserServiceImp: updatePartially :  "+user.toString()+ "ID:"+id);
        User usr = findById(id);
        usr.setCountry(user.getCountry());
        return userRepository.save(usr);
    }
	
	public List<User> findByNameOrIdOrCountry(User user) {
		logger.info("UserServiceImp: findByName: " +user);
		
		List<User> userList = (List<User>) userRepository.findAll();
		logger.info("UserServiceImp: findByName : userList :" +userList.toString());
		userList = userList.stream().filter(userInfo-> {
			boolean isValid = false;
			if(userInfo.getName().equalsIgnoreCase(user.getName()) || userInfo.getId()==user.getId() || userInfo.getCountry().equalsIgnoreCase(user.getCountry()) ) {
				isValid = true;
			}
			return isValid;
		}).collect(Collectors.<User>toList()); 
		logger.info("Aftaer filter: userList :" +userList.toString());
        return userList;
	}
	
}
