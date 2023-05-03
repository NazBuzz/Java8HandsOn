package com.nazzbuzz.Java8;

import com.nazzbuzz.interfaces.MathematicalInterface;
import com.nazzbuzz.model.Employee;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceTrials {
    //Using Predicate
    static Predicate<Employee> noAInName = e -> !e.getEmpName().contains("a");

    public static void main(String[] args) {
        // Using Functional Interface
        MathematicalInterface sq = x -> x * x;
        //MathematicalInterface w;

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(integerList.stream().map(sq::square).toList());

        integerList.forEach(x -> System.out.println(sq.square(x)));


        System.out.println(SortMain.getList().stream().filter(noAInName).toList());

        System.out.println(SortMain.getList().stream().anyMatch(x -> sq.emId18(x)));
    }

}
