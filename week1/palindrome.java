package week;
import java.util.*;

public class palindrome{
	public static void main(String[] a){
	System.out.println("enter any number to check weather a number a nu beer is palindrome or not ");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int x=n;
	int s=0,r;
	while(n>0)
	{
	r=n%10;
	s=(s*10)+r;
	n=n/10;
	}
	if(x==s)
	{
	System.out.println("given number is palindrome ");
	}
	else
	{
	System.out.println("given number is not a palindrome ");
	}
	}
	}
	 
	
