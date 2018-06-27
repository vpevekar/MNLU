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
    @Table(name="aggregate_attendance_sem")
public class aggregate_attendance_sem implements Serializable {
    private int pkey_agg_att_sem;
    
    private Date month;
    private int subject_id;
    private int studenthd_id;
    private String student_name;
    private int no_of_days_present;
    private int no_of_days_absent;
    private int leaves;
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    
    public int getpkey_agg_att_sem() {
        return pkey_agg_att_sem;
    }

    public void setpkey_agg_att_sem(int pkey_agg_att_sem) {
        this.pkey_agg_att_sem = pkey_agg_att_sem;
    }
    
    public Date getmonth(){
        return month;
    }
    
    public void setmonth(Date month) {
        this.month = month;
    }
    
    public int getsubject_id() {
        return subject_id;
    }

    public void setsubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
    
    public int getstudenthd_id() {
        return studenthd_id;
    }

    public void setstudenthd_id(int studenthd_id) {
        this.studenthd_id = studenthd_id;
    }
    
    @Column(length=75)
    public String getstudent_name() {
        return student_name;
    }

    public void setstudent_name(String student_name) {
        this.student_name = student_name;
    }
    
    public int getno_of_days_present() {
        return no_of_days_present;
    }

    public void setno_of_days_present(int no_of_days_present) {
        this.no_of_days_present = no_of_days_present;
    }

    public int getno_of_days_absent() {
        return studenthd_id;
    }

    public void setno_of_days_absent(int no_of_days_absent) {
        this.no_of_days_absent = no_of_days_absent;
    }

    public int getleaves() {
        return leaves;
    }

    public void setleaves(int leaves) {
        this.leaves = leaves;
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