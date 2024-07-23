package week;
import java.lang.Math;
import java.util.*;
public class quadratic{
	public static void main(String[] args){
	System.out.println("enter the a ,b and c values in ax^2+bx+c");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int r=(b*b-4*a*c);
	double z=Math.pow(r,0.5);
	double r1=(-b+(z/2*a));
	double r2= (b+(z/2*a));
	
	System.out.println("the imaginary roots are "+r1+"  "+r2);
	}
	}
