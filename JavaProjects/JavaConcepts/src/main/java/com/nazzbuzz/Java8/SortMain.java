package com.nazzbuzz.Java8;

import com.nazzbuzz.model.Employee;
import com.nazzbuzz.util.EmpComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortMain {

    public static List<Employee> getList(){
        Employee e1 = new Employee();
        e1.setEmpId(31);
        e1.setEmpName("Stacy");

        Employee e2 = new Employee();
        e2.setEmpId(1);
        e2.setEmpName("Grace");

        Employee e3 = new Employee();
        e3.setEmpId(11);
        e3.setEmpName("Greek");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        return empList;
    }

    public static void main(String[] args) {
        /*Employee e1 = new Employee();
        e1.setEmpId(31);
        e1.setEmpName("Stacy");

        Employee e2 = new Employee();
        e2.setEmpId(1);
        e2.setEmpName("Grace");
        
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);*/

        List<Employee> empList = getList();
        System.out.println(empList);

        EmpComparator empComparator = new EmpComparator();
        empList.sort(empComparator);
        System.out.println(empList);

        /* Employee e3 = new Employee();
        e3.setEmpId(11);
        e3.setEmpName("Greek");
        empList.add(e3);*/

        Collections.sort(empList);
        System.out.println(empList);

        List<Employee> sortedList = empList.stream().sorted().toList();
        System.out.println(sortedList.toString());

        List<Employee> sortedList2 = empList.stream().sorted(Employee::compareTo).toList();
        System.out.println(sortedList2);

        List<Employee> sortedListWithComparator = empList.stream().sorted(empComparator).toList();
        System.out.println(sortedListWithComparator);

        List<Employee> sortedListWithComparator2 = empList.stream().sorted((o1, o2) -> o1.getEmpId()).toList();
        System.out.println(sortedListWithComparator2);

    }


}
