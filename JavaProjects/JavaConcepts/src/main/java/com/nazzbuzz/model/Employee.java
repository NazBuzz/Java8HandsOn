package com.nazzbuzz.model;

public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public int compareTo(Employee o) {
        if(o.getEmpId() == this.getEmpId()) {
            if(o.getEmpName().equalsIgnoreCase(this.getEmpName()))
                return 0;
        } else if (o.getEmpId() > this.getEmpId()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
