package com.joysistvi.day27.program;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create an arraylist to store stydent objects
        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "JM", "Malabon", "18484713339"));
        employeesList.add(new Employee(102, "Ced", "Rizal", "18484271339"));
        employeesList.add(new Employee(103, "Aljane", "Romblon", "18484713329"));

        System.out.println("List of Employees: ");
        employeesList.forEach(employee -> System.out.println(employee.getName()));
        //employeesList.forEach(System.out::println);

        


    }

}

/*// arraylist - get (default choide)
        //linkedlist - add, delete*/
