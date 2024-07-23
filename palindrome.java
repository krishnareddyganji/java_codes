import java.util.*;

class palindrome{
	public static void main(String [] args){
	check s=new check();
	s.pali();	
	}
	}
	
	
   class check{
   
	void pali(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number to check wheather palindrom or not ");
		int n=sc.nextInt();
		int s=0,r,k=n;
		
		 while(n>0){
			 r=n%10;
			 s=(s*10)+r;
			 n=n/10;
			 }
		 if(s==k){
			 System.out.println("given number is palindrome ");
			 }
		 else{
			 System.out.println("give number is not palindrome");
			 }
		 }
		 }
