package com.tclab.cc.hr.thirtydays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-2d-arrays/problem
public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int temp = -64;
        int max = -64;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                temp = arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                
                max = temp > max ? temp : max;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
