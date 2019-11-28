package com.company;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class NewClass {

    public static void TaskOne(int min, int max, int amt) {
        List<Integer> taskOneList = new ArrayList<Integer>();
        Random r = new Random();

        for (int i = 0; i < amt; i++) {
            taskOneList.add(r.nextInt((max - min) + 1) + min);
        }
        System.out.println("Original ArrayList (Task 1): " + taskOneList);
        for (int i = 0; i < taskOneList.size(); i++) {
            //System.out.println(" Index: " + i + " " + taskOneList.get(i));
            if((i % 2) == 0) {
                taskOneList.remove(taskOneList.get(i));
            }
        }
        Collections.sort(taskOneList);
        System.out.println("\nModified ArrayList (Task 1): " + taskOneList);
    }
    public static void TaskTwo(int min, int max, int amt) {
        System.out.println("\n-------------------- Task 2\n");
        List<Integer> taskTwoList = new ArrayList<Integer>();
        Random r = new Random();

        for (int i = 0; i < amt; i++) {
            taskTwoList.add(r.nextInt((max - min) + 1) + min);
        }
        System.out.println("Original ArrayList (Task 2): " + taskTwoList);
        for (int i = 0; i < taskTwoList.size(); i++) {
            if((i % 3) == 0 && i >= 3) {
                taskTwoList.add(i+1, r.nextInt((25 - 20) + 1) + 20);
            }
        }
        System.out.println("\nModified ArrayList (Task 2): " + taskTwoList);
    }

}
