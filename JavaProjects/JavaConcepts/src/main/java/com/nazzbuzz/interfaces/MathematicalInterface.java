package com.nazzbuzz.interfaces;

import com.nazzbuzz.model.Employee;

@FunctionalInterface
public interface MathematicalInterface {

    int square (int x);

    default boolean emId18(Employee o){
        return o.getEmpId()>18;
    }
}
