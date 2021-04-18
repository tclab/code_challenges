import java.util.Scanner;

public class Solution10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      
      int result = 0;
      int counter = 0;
      String binary = Integer.toString(n,2);
      for(int i=0; i < binary.length(); i++){
        if(binary.charAt(i) == '1'){
          counter += 1;
          result = counter > result ? counter : result;
        } else {
          result = counter > result ? counter : result;
          counter = 0;
        }
      }

      System.out.println(result);
      scanner.close();
    }
}
