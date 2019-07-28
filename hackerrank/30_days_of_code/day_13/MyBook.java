import java.util.*;

class MyBook extends Book {

    private int price;

    public MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    public void display(){
        System.out.println(String.format("Title: %s \nAuthor: %s \nPrice: %s", this.title, this.author, this.price));
    }
}