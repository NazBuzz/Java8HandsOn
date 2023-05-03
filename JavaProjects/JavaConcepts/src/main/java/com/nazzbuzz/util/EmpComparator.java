package com.nazzbuzz.util;

import com.nazzbuzz.model.Employee;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpId() == o2.getEmpId()) {
            if(o1.getEmpName().equalsIgnoreCase(o2.getEmpName()))
                return 0;
        } else if (o1.getEmpId() > o2.getEmpId()) {
            return 1;
        }
        return -1;
    }
}
