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
    @Table(name="leave_transiction")
public class leave_transiction implements Serializable{
    private int pkey_leave_id;
    
    
    private int student_id;
    private int subject_id;
    private Date from_date;
    private Date to_date;
    private String leave_type;
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
   
     @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
     
     public int getpkey_leave_id() {
        return pkey_leave_id;
    }

    public void setpkey_leave_id(int pkey_leave_id) {
        this.pkey_leave_id = pkey_leave_id;
    }
    
    public int getstudent_id() {
        return student_id;
    }

    public void setstudent_id(int student_id) {
        this.student_id = student_id;
    }
    
    public int getsubject_id() {
        return userId;
    }

    public void setsubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
    
    public Date getfrom_date(){
        return from_date;
    }
    
    public void setfrom_date(Date from_date) {
        this.from_date = from_date;
    }
    public Date getto_date(){
        return to_date;
    }
    
    public void setto_date(Date to_date) {
        this.to_date = to_date;
    }
    @Column(length=75)
    public String getleave_type() {
        return leave_type;
    }

    public void setleave_type(String leave_type) {
        this.leave_type = leave_type;
    }
     
     
    
   
    
     
    @Column(length=75)
    public String getcreated_by() {
        return created_by;
    }

    public void setcreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date created_on(){
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
