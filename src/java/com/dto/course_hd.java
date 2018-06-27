/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
/**
 *
 * @author abc
 */
@Entity
    @Table(name="course_hd")
public class course_hd implements Serializable {
    private int pkey_coursehd_id;
    
    private int course_id;
    private String course_type;
    private String course_name;
    private String description;
    
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    
    public int getpkey_coursehd_id() {
        return pkey_coursehd_id;
    }

    public void setpkey_coursehd_id(int pkey_coursehd_id) {
        this.pkey_coursehd_id = pkey_coursehd_id;
    }
     public int getcourse_id() {
        return course_id;
    }

    public void setcourse_id(int course_id) {
        this.course_id = course_id;
    }
  
    
    @Column(length=75)
    public String getcourse_type() {
        return course_type;
    }

    public void setcourse_type(String course_type) {
        this.course_type = course_type;
    }
    
    @Column(length=75)
    public String getcourse_name() {
        return course_name;
    }

    public void setcourse_name(String course_name) {
        this.course_name = course_name;
    }
    
    @Column(length=75)
    public String getdescription() {
        return description;
    }

    public void setstudent_name(String description) {
        this.description = description;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Column(length=75)
    public String getcreated_by() {
        return created_by;
    }

    public void setcreated_by(String created_by) {
        this.created_by = created_by;
    }

    public void Date created_on(){
        return created_on;
    }
    
    public void setcreated_on(Date created_on) {
        this.created_on = created_on;
    }
      
    @Column(length=75)
    public String getmodified_by() {
        return modified_by;
    }

    public void setmodified_by(String modified_by) {
        this.modified_by = modified_by;
    }
     
    public void Date modified_on(){
        return modified_on;
    }
    
    public void setmodified_on(Date modified_on) {
        this.modified_on = modified_on;
    }
      
    @Column(length=75)
    public String getdeleted_by() {
        return deleted_by;
    }

    public void setdeleted_by(String deleted_by) {
        this.deleted_by = deleted_by;
    }
     
    public void Date deleted_on(){
        return deleted_on;
    }
    
    public void setdeleted_on(Date deleted_on) {
        this.deleted_on = deleted_on;
    }
    
    
}
