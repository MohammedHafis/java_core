package constructor;

class Library{
    private String title;
    private String Author;
    private Integer price;

    public Library(String title,String Author, Integer price){
        this.Author=Author;
        this.title=title;
        this.price=price;
    }
    public Library(String title,String Author){
        this.Author=Author;
        this.title=title;
    }

    public Library(){
        this.Author="Unknown";
        this.title="Unknown";
        this.price=00;
    }

    public void display(){
        System.out.println("title: " + title);
        System.out.println("author: " + Author);
        System.out.println("price: " + price);
        System.out.println();
    }

}

public class Book {
    public static void main(String[] args){
        Library book1 = new Library("Rose","William",213);
        book1.display();

        Library book2 = new Library("Jasmine","mike");
        book2.display();

        Library book3 = new Library();
        book3.display();
    }
}
