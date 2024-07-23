/*5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.*/
import java.util.*;

	
	
	 
public class E_Bookstall{

	public static void main(String [] args){
	Scanner input=new Scanner (System.in);
	book b=new book();
	customer c=new customer();
	
	
	System.out.println("how many books in th stall");
	int n=input.nextInt();
	System.out.println("how many customers ..??  ");
	int k=input.nextInt();
	
	customer bookArray[]=new customer[n];
	book customersArray[]=new book[k];
	
	System.out.println("enter the details of books in the stall");
	for(int i=0;i<n;i++){
		bookArray[i]=new book();
		System.out.print("enter the book name ");
		b.Book_Name=input.nextLine();
		System.out.print("enter the book author name");
		b.Book_Author=input.nextLine();
		System.out.print("enter the book count");
		b.book_count=input.nextInt();
		}
		
	for(int j=0;j<k;j++){
		customersArray[i]=new customers();
		System.out.print("enter the customers id ");
		k.customers_Id=input.nextInt();
		System.out.print("enter the customers name ");
		k.customers_Name=input.nextLine();
		}
		
		}
		class book{
	String Book_Name;
	String Book_Author; 
	int Book_Count;
	}
	
	class customer{
	int Customer_Id;
	String Customer_Name;
	}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
