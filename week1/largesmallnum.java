package week;
import java.util.*;
	public class largesmallnum{
		public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
			System.out.println("enter the number 1");
			int num1=sc.nextInt();
			System.out.println("enter the number 2");
			int num2=sc.nextInt();
			System.out.println("enter the number 3");
			int num3=sc.nextInt();
			System.out.println("enter the number 4");
			int num4=sc.nextInt();
			System.out.println("enter the numer 5");
			int num5=sc.nextInt();
			//now declaring number 1 as smaller and larger 
			//coparing numer 1 whith all number
			//if any number is smaller then num1, smaller will update
			//is any numner is large then num 1,large will update 
			int smallest=num1;

			if(smallest>num2)
			smallest=num2;
			if(smallest>num3)
			smallest=num3;
			if(smallest>num4)
			smallest=num4;
			if(smallest>num5)
			smallest=num5;
			
			System.out.println("the smallest number among  5 numbers is::"+smallest);
			
			int largest=num1;
			if(largest<num2)
			largest=num2;
			if(largest<num3)
			largest=num3;
			if(largest<num4)
			largest=num4;
			if(largest<num5)
			largest=num5;
			System.out.println("the largest number among 5 numbers is ::"+largest);
			
			}
			}
			
			
			
			
