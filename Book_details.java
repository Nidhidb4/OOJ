import java.util.Scanner;

class Book {
 String name;
 String author;
 double price;
 int num_pages;

Book(String name, String author, double price, int num_pages) {
 this.name = name;
 this.author = author;
 this.price = price;
 this.num_pages = num_pages;
}

   
void setDetails(String name, String author, double price, int num_pages) {
 this.name = name;
 this.author = author;
 this.price = price;
 this.num_pages = num_pages;
 }

   
String getDetails() {
 return "Name of the book: " + name + ", Name of the author: " + author + ", Price of the book: " + price + ", Pages: " + num_pages;
}

   
public String toString() {
 String details = "Name of the book: " + name + ", Name of the author: " + author + ", Price of the book: " + price + ", Pages: " + num_pages;

 return details;
    }
}

public class Book_details {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the number of books: ");
  int n = scanner.nextInt();
  scanner.nextLine();

  Book[] books = new Book[n];

       
  for (int i = 0; i < n; i++) {
     System.out.println("Enter details for book " + (i + 1) + ":");
           
     System.out.print("Name: ");
     String name = scanner.nextLine();
           
     System.out.print("Author: ");
     String author = scanner.nextLine();
           
     System.out.print("Price: ");
     double price = scanner.nextDouble();
           
     System.out.print("Number of pages: ");
     int num_pages = scanner.nextInt();
     scanner.nextLine();

     books[i] = new Book(name, author, price, num_pages);
        }

       
     System.out.println("\nBook Details:");
      for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
           System.out.println("NIDHI D B");
        }

       
    }
}
