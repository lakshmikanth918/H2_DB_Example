package com.kanth.jpa_tx_app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    @Column
    private String empName;
    @Column
    private Integer age;

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    
}
