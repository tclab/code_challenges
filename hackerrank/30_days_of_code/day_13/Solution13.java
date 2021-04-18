import java.util.*;


public class Solution13 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book13 book = new MyBook13(title, author, price);
        book.display();
    }

    abstract static class Book13 {
        String title;
        String author;

        Book13(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook13 extends Book13 {

        private int price;

        public MyBook13(String title, String author, int price){
            super(title, author);
            this.price = price;
        }

        @Override
        public void display(){
            System.out.println(String.format("Title: %s \nAuthor: %s \nPrice: %s", this.title, this.author, this.price));
        }
    }
}