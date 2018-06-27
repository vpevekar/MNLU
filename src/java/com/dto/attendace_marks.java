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
    @Table(name="attendace_marks")
public class attendace_marks implements Serializable{
    private int pkey_attendance_mark;
    private int min_range;
    private int max_range;
    private int marks;
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    
    public int getpkey_attendance_mark() {
        return pkey_attendance_mark;
    }

    public void setpkey_attendance_mark(int pkey_attendance_mark) {
        this.pkey_attendance_mark = pkey_attendance_mark;
    }
    
    public int getmin_range() {
        return min_range;
    }

    public void setmin_range(int min_range) {
        this.min_range = min_range;
    }
    
    public int getmax_range() {
        return max_range;
    }

    public void setmax_range(int max_range) {
        this.max_range= max_range;
    }
    
    public int getmarks() {
        return marks;
    }

    public void setmarks(int marks) {
        this.marks = marks;
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
