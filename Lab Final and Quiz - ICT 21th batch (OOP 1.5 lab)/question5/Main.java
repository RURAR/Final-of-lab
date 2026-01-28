class Book {
    int bookId;
    String title;
    double price;
    Book(int bookId, String title, double price) {
        this.bookId=bookId;
        this.title=title;
        this.price=price;
    }

    void display() {
        System.out.println("Book ID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args) {
        Book[] books=new Book[5];
        books[0]=new Book(101, "OOP with java", 450);
        books[1]=new Book(102, "Discrete mathematics", 650);
        books[2]=new Book(103, "Data structures", 700);
        books[3]=new Book(104, "Algorithms analysis and design", 550);
        books[4]=new Book(105, "Vector calculas", 400);

        double total=0;

        for (Book b:books) {
            if (b.price>500) {
                b.display();
            }
            total+=b.price;
        }
        double average=total/books.length;
        System.out.println("Average price of all books: "+average);
    }
}
