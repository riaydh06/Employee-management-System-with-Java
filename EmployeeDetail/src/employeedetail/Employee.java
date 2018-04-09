/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedetail;

import java.util.Date;
 
public class Employee {
    private int e_Id;
    private String empName;
    private Date dob;
    private double salary;
    private int deptId;
     
    public int getEmpId() {
        return e_Id;
    }
    public void setEmpId(int empId) {
        this.e_Id = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public int getDeptId() {
        return deptId;
    }   
 
    //toString()
}
