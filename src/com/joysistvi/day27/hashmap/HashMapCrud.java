package com.joysistvi.day27.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapCrud {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(2026001, "James Micheal");
        students.put(2026002, "Niel Jay");
        students.put(2026003, "Mark Daniel");

        System.out.println("Student List 2026002: " + students.get(2026002));

        students.put(2026002, "Cedrick Manito");
        System.out.println("Updated 2026002: " + students.get(2026002));

        int searchId = 2026001;
        if (students.containsKey(2026001)){
            System.out.println(searchId + " is enrolled");
        }else{
            System.out.println(searchId + " is not found");
        }
        students.remove(2026003);

//        Set set = students.keySet()Set();

        System.out.println("\nEnrolled Student List: ");
        for(int id : students.keySet()){
            System.out.println(id+" - "+students.get(id));
        }
       students.forEach((id, name)->{
           System.out.println(id + " + " + name);
       });

    }
}
