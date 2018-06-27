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
    @Table(name="subject_hd")
public class subject_hd {
    private int pkey_subjecthd_id;
    
    
    private int subject_id;
    private int course_id;
    private String subject_name;
    private int min_attandance;
    
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
     @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")

    
     public int getpkey_subjecthd_id() {
        return pkey_subjecthd_id;
    }

    public void setpkey_subjecthd_id(int pkey_subjecthd_id) {
        this.pkey_subjecthd_id = pkey_subjecthd_id;
    }
    
     public int getsubject_id() {
        return subject_id;
    }

    public void setsubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
    
     public int getcourse_id() {
        return course_id;
    }

    public void setcourse_id(int course_id) {
        this.course_id = course_id;
    }
     
     
     
         @Column(length=75)
    public String getsubject_name() {
        return subject_name;
    }

    public void setsubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    
     public int getmin_attandance() {
        return min_attandance;
    }

    public void setmin_attandance(int min_attandance) {
        this.min_attandance = min_attandance;
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
