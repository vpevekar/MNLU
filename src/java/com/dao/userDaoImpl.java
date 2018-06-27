/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.dto.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Shekhar
 */
public class userDaoImpl extends HibernateDaoSupport implements userDao {

    public boolean addUser(User user, String loggedInUser){// throws Exception {
        //try {
            getHibernateTemplate().save(user);
        //} catch (Exception e) {
         //   e.printStackTrace();
        //}
          return false;
    }

    public boolean updateUser(User user, String loggedInUser) {
        try {
            getHibernateTemplate().update(user);
        } catch (Exception e) {
        }
        return false;   
    }

    public boolean deleteUser(User user, String loggedInUser) {
        try {
            getHibernateTemplate().delete(user);
        } catch (Exception e) {
        }
        return false;
    }

    public List findAllUsers(String loggedInUser) {
        List userList = new ArrayList();
        try {
            userList = getHibernateTemplate().find("from User");
        } catch (Exception e) {
        }
        return userList;
    }

}
