import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;
    double price;
    int stocklevel;

    public Book(String title, String author, String isbn, double price, int stocklevel) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.stocklevel = stocklevel;
    }

    public void discount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void restock(int stock) {   // fixed
        stocklevel += stock;
    }

    public boolean isAvailable() {
        return stocklevel > 0;
    }

    public void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println("Stock Level: " + stocklevel);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}

public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter stock level: ");
        int stock = sc.nextInt();

        Book book = new Book(title, author, isbn, price, stock);

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        book.discount(discount);

        System.out.print("Enter restock amount: ");
        int restockAmount = sc.nextInt();
        book.restock(restockAmount);

        book.display();

        sc.close();
    }
}