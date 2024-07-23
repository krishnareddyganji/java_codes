/*2. Write an application that uses String method equals and equalsIgnoreCase to tests
any two string objects for equality.*/
import java.util.*;
class stringequals{
	public static void main(String [] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the two strings");
		 String s1=sc.nextLine();		 
		 String s2=sc.nextLine();
		 System.out.println(" for String method equals" );
		 System.out.println(s1.equals(s2));
		 System.out.println(" for String method equalsIgnorecase" );
		 System.out.println(s1.equalsIgnoreCase(s2));
}
}
		 
