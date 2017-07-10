package com.lakshmi.springmvc.dao;

import java.util.List;

import com.lakshmi.springmvc.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}