import java.util.Scanner;

public class Solution5 {



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
