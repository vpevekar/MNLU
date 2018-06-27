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
    @Table(name="attendance")
public class attendance implements Serializable {
    private int pkey_studenthd_id;
    
    private int enrolment_no;
    private Date date_time;
    private String Attendance_type;
    private int pkey_leave_id;
    
    
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
        this.pkey_studenthd_idpkey_studenthd_id = pkey_studenthd_id;
    }
    
    public int enrolment_no() {
        return enrolment_no;
    }

    public void setenrolment_no(int enrolment_no) {
        this.enrolment_no = enrolment_no;
    }
    
    public void Date date_time(){
        return date_time;
    }
    
    public void setdate_time(Date date_time) {
        this.date_time = date_time;
    }
    
    @Column(length=75)
    public String getAttendance_type() {
        return Attendance_type;
    }

    public void setAttendance_type(String Attendance_type) {
        this.Attendance_type = Attendance_type;
    }
    
    public int getpkey_leave_id() {
        return pkey_leave_id;
    }

    public void setpkey_leave_id(int pkey_leave_id) {
        this.pkey_leave_id = pkey_leave_id;
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
