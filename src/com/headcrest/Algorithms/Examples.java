package com.headcrest.Algorithms;

import java.util.ArrayList;

/**
 * Created by mbe on 21/09/15.
 */
public class Examples {

    public static void main(String[] args) {
        Example1(1000000);
        Example1(10000000);
        Example1(100000000);
        Example1(1000000000);
    }

    public static void Example1(long n){
        long startTime = System.currentTimeMillis();
        long k = 0;

        for (int i = 1; i <= n ; i++) {
            k = k + 5;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time for n = " + n + " was " + (endTime - startTime) + " ms");
    }

    private static void Example2(long n){
        long k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k = k + i + j;
            }
        }
    }

    private static void Example3(long n){
        long k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 20; j++) {
                k = k + i + j;
            }
        }
    }

    private static void Example4(long n){
        long k = 0;

        for (int i = 1; i <= 10; i++) {
            k = k + 4;
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= 20; j++) {
                k = k + i + j;
            }
        }
    }

    private static void Example5(ArrayList<Integer> list){
        if (list.contains(2)){
            System.out.print("success");
        }else{
            for (Integer integer : list) {
                System.out.print(integer);
            }
        }
    }

}
