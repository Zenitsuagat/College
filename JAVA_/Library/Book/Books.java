package Library.Book;

public class Books{
    String title;
    String author;
    double price;

    public Books(String name,String aname, double pr){
        this.title = name;
        this.author = aname;
        this.price = pr;
    }

    public void display(){
        System.out.println("Title : "+this.title+"\nAuthor : "+this.author+"\nPrice : $"+this.price);
    }
}