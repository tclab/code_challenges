import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0;i<T;i++){
          String s = sc.nextLine();
          sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          String even = "";
          String odd = "";
          for(int j=0;j<s.length();j++){
            if(j == 0 || j%2==0){
              even += s.charAt(j);
            } else {
              odd += s.charAt(j);
            }
          }

          System.out.println(even + " " + odd);
        }

        sc.close();
    }
}

