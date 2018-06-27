/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.dao.IBaseDAO;
import java.util.List;
import com.dto.User;

/**
 *
 * @author Shekhar
 */
public interface userDao extends IBaseDAO{
    boolean addUser(User user,String loggedInUser);
    boolean updateUser(User user,String loggedInUser);
    boolean deleteUser(User user,String loggedInUser);
    List<User> findAllUsers(String loggedInUser);
 
    
}