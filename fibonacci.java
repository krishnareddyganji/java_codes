import java.util.*;

public class fibonacci{
	int a=0;
	int b=1; 
	int c;
	public static void main(String args[]){
	fibonacci f=new fibonacci();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number for the fibonacci series");
	int n=sc.nextInt();
	System.out.println(f.a+" \n" + f.b);
	f.fibo(n-2);
		
	}
	 int  fibo(int n){
	 if(n==0){
	 return 0;
	 }
	 else{
		a=c+b;
		System.out.println(a);
		c=b;
		b=a;
		fibo(n-1); 
	
	}
	return 0;
	}
	
	}
