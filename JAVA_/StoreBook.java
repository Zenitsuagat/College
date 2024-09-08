import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;
    int noofcopies;

    void getBookDet(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Title : ");
        this.title = input.nextLine();

        System.out.print("Enter the author : ");
        this.author = input.nextLine();

        System.out.print("Enter the price : ");
        this.price = input.nextDouble();

        System.out.print("Enter the noubmer of copy : ");
        this.noofcopies = input.nextInt();

        input.nextLine();
    }

    void displayBook(){
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : $"+this.price);
        System.out.println("Number of Copies : "+this.noofcopies);
        System.out.println("----------------------------------------");
    }
}

public class StoreBook{
        public static void main(String[] args){
        Book[] books = new Book[3];

        for(int i=0;i<books.length;i++){
            books[i] = new Book();
            System.out.println("Enter the details of Book "+(i+1)+": ");
            books[i].getBookDet();
        }

        System.out.println("\nBooks in Store : ");
        for(Book book : books){
            book.displayBook();
        }
        }
}
