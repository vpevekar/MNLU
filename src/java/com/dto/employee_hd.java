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
    @Table(name="employee_hd")
public class employee_hd implements Serializable {
    private int pkey_Employeehd_id;
    
    private int pkey_user_id;
    private String Employee_type;
    private String Employee_name;
    private int Employeetype_id;
    
    
    
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on; 
    private String deleted_by;
    private Date deleted_on;
    
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    
    public int getpkey_Employeehd_id() {
        return pkey_Employeehd_id;
    }

    public void setpkey_Employeehd_id(int pkey_Employeehd_id) {
        this.pkey_Employeehd_id = pkey_Employeehd_id;
    }
   
    public int getpkey_user_id() {
        return pkey_user_id;
    }
    public void setpkey_user_id(int pkey_user_id) {
        this.pkey_user_id = pkey_user_id;
    }
    
    @Column(length=75)
    public String getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(String Employee_type) {
        this.Employee_type = Employee_type;
    }
    @Column(length=75)
    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }
    
    public int getEmployeetype_id() {
        return Employeetype_id;
    }

    public void setEmployeetype_id(int Employeetype_id) {
        this.Employeetype_id = Employeetype_id;
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
