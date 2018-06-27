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
    @Table(name="student_hd")
public class student_hd extends Serializable {
     private int pkey_studenthd_id;
    
    
    private int pkey_user_id;
    private int enrollnprivatement_no;
    private String first_name;
    private String last_name;
    private String course_name;
    private int phone_no;
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
     @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
     
    
     public int getpkey_studenthd_id() {
        return pkey_studenthd_id;
    }

    public void setpkey_studenthd_id(int pkey_studenthd_id) {
        this.pkey_studenthd_id = pkey_studenthd_id;
    } 
    
     public int getpkey_user_id() {
        return pkey_user_id;
    }

    public void setenrollnprivatement_no(int enrollnprivatement_no) {
        this.enrollnprivatement_no = enrollnprivatement_no;
    } 
    
     public int getenrollnprivatement_no() {
        return enrollnprivatement_no;
    }

    public void setenrollnprivatement_no(int enrollnprivatement_no) {
        this.enrollnprivatement_no = enrollnprivatement_no;
    } 
     
    
        @Column(length=75)
    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Column(length=75)
    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }
    @Column(length=75)
    public String getcourse_name() {
        return course_name;
    }

    public void setcourse_name(String first_name) {
        this.course_name = course_name;
    }
    
     public int getphone_no() {
        return phone_no;
    }

    public void setphone_no(int phone_no) {
        this.phone_no = phone_no;
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
