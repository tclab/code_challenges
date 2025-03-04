package com.tclab.cc.hr.thirtydays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-loops/problem
public class Day5 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n>=2 && n<=20){
          for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (i*n));
          }
        }
        scanner.close();
    }
}
