package com.nazzbuzz.Java8;

import com.nazzbuzz.model.Employee;

import java.sql.Array;
import java.util.*;

public class StreamsQA {

    public static void main(String[] args) {

        // sum of all even nums
        System.out.println(sumOfAllEven());

        //Write a Java program to find the average of all the elements in an array using streams.
        System.out.println(avgOfAllInts());

        //Given a list of strings, write a Java program to filter out all the strings that
        // contain the letter 'a' and print the remaining strings using streams.

        printAllWordsExceptA();

        //Write a Java program to find the maximum and minimum value from a list of integers using streams.
        maxMin();

        //Given a list of Employee objects with attributes such as id, name, and salary,
        // write a Java program to find the employee with the highest salary using streams.

        highestId();
    }

    private static int sumOfAllEven() {
        //*In this program, we first create a list of integers using the Arrays.asList() method.
        // Then, we use a stream to filter out all the even numbers using the filter() method
        // and a lambda expression that checks if the number is divisible by 2 with no remainder.
        // Next, we use the mapToInt() method to convert the stream of integers to an IntStream
        // and then sum up all the even numbers using the sum() method. Finally,
        // we print the sum of all even numbers to the console.*/

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        return integerList.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    private static Double avgOfAllInts () {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        return integerList.stream().mapToInt(Integer:: intValue).average().getAsDouble();
    }

    private static void printAllWordsExceptA() {
        List<String> stringList = Arrays.asList("Java","Community", "Edition", "Brains");
        System.out.println(stringList.stream().filter(x -> !x.contains("a")).toList());
    }

    private static void maxMin(){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Max: "+ integerList.stream().mapToInt(Integer:: intValue).max());
        System.out.println("Min: "+ integerList.stream().mapToInt(Integer:: intValue).min());
    }


    private static void highestId(){

        List<Employee> getList = SortMain.getList();
        System.out.println(getList.stream().max((e1,e2) -> Double.compare(e1.getEmpId(), e2.getEmpId())).orElseThrow(NoSuchElementException::new));

    }

}
