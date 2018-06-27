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
    @Table(name="attendence_aggregate_month")
public class attendence_aggregate_month implements Serializable{
    private int pkey_aggregate_month;
    
    private int pkey_studenthd_id;
    private int enrollment_no;
    private int no_of_days_present;
    private int no_of_days_absent;
    private Date month;
   
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    
    public int getpkey_aggregate_month() {
        return pkey_agg_att_sem;
    }

    public void setpkey_aggregate_month(int pkey_aggregate_month) {
        this.pkey_aggregate_month = pkey_aggregate_month;
    }
    
    
    
    public int getpkey_studenthd_id() {
        return pkey_studenthd_id;
    }

    public void setpkey_studenthd_id(int pkey_studenthd_id) {
        this.pkey_studenthd_id = pkey_studenthd_id;
    }
    
    public int getenrollment_nod() {
        return enrollment_no;
    }

    public void setenrollment_no(int enrollment_no) {
        this.enrollment_no = enrollment_no;
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
    public void Date month(){
        return month;
    }
    
    public void setmonth(Date month) {
        this.month = month;
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
