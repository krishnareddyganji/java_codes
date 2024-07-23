import java.util.*;
public class prime{
  	int n;
  	int count=0;
  	
	public static void main(String [] args){
	
	prime p=new prime();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter thE Number to check whether a given nuber is a prime or not ");
	p.n=sc.nextInt();
	p.pri(p.n);
	
	}
	 
	 
	void pri(int n){
	for(int i=0;i<n;i++){
		if(n%i==0){
		count++;
		}
		}
		
			
		if(count>=2){
		System.out.println("prime number");
		}
		else{
		System.out.println("not peime");
		}
		}
		
		
		
	}
