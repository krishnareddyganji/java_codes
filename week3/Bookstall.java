/*5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.*/
import java.util.*;

class Book {
    String Book_Name;
    String Book_Author;
    int Book_Count;
}

class Customer {
    int Customer_Id;
    String Customer_Name;
    String Customer_Address;
}

public class Bookstall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books");
        int totalBooks = sc.nextInt();
        Book bookArray[] = new Book[totalBooks];

        for (int i = 0; i < totalBooks; i++) {
            sc.nextLine(); 
            System.out.println("Enter details for book " + (i + 1) + " ::");
            bookArray[i] = new Book();
            System.out.print("Enter the book name :: ");
            bookArray[i].Book_Name = sc.nextLine();
            System.out.print("Enter the book count :: ");
            bookArray[i].Book_Count = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter the book author name :: ");
            bookArray[i].Book_Author = sc.nextLine();
        }

        System.out.println("Enter the number of customers ");
        int c = sc.nextInt();

        Customer cArray[] = new Customer[c];
        for (int i = 0; i < c; i++) {
            cArray[i] = new Customer();
            System.out.println("Enter details for customer " + (i + 1) + " ::");
            System.out.print("Enter the customer id :: ");
            cArray[i].Customer_Id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter the customer name :: ");
            cArray[i].Customer_Name = sc.nextLine();
            System.out.print("Enter the address of the customer :: ");
            cArray[i].Customer_Address = sc.nextLine();
        }
         System.out.println("books avilable in book stalll ");
         for(int i=0;i<totalBooks;i++){
         
         System.out.println(bookArray[i].Book_Name);
         
         }
         
         
        System.out.println("Enter the book name to buy :: ");
        String bookName = sc.next();
        System.out.println("enter the no.of books buyed");
        int k=sc.nextInt();

        boolean bookFound = false;
        for (int i = 0; i < totalBooks; i++) {
            if (bookName.equals(bookArray[i].Book_Name)) {
                int a=(bookArray[i].Book_Count)-k;
             System.out.println("Book found.The remaining count of the " + bookArray[i].Book_Name+" is "+a);
                bookFound = true;
                break; 
            }
        }

        if (!bookFound) {
            System.out.println("Book not found");
        }
    }
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
