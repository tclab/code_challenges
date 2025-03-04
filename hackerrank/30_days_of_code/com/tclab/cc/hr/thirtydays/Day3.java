package com.tclab.cc.hr.thirtydays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-conditional-statements/problem
public class Day3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean isEven = N%2==0?true:false;
        if(isEven && ((N>=2 && N<=5) || (N>20))){
          System.out.println("Not Weird");
        } else if(!isEven || (isEven && (N>=6 && N<=20))) {
          System.out.println("Weird");
        } 

        scanner.close();
    }
}
