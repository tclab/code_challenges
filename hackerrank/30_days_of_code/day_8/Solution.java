//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //Get phone book
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        //Print phone book queries
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s) == null){
              System.out.println("Not found");
            } else {
              System.out.println(s+"="+phoneBook.get(s));
            }
        }
        in.close();
    }
}

