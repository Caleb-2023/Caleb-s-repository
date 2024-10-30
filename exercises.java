package com.Aberdeen;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("enter the number of start:");
        int start = scanner.nextInt();
        System.out.println("enter the number of end:");
        int end = scanner.nextInt();

        int sum = 0;

        if (start < end){
            for (int i = start; i <= end; i++) {
                sum += i;}}
             else {
                System.out.println("the input is wrong!");
            }

        System.out.println(sum);
        }

    }

