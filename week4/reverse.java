/*7. Write an application that uses String method charAt to reverse the string.*/
import java.util.*;

class reverse{
		void reverse(String s){
		for(int i=s.length()-1;i>=0;i--){
		
	        System.out.print(s.charAt(i));
		
		}
		}
	public static void main(String [] ar){

		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the string :: ");
		String s=sc.nextLine();
		reverse obj=new reverse();
		obj.reverse(s);
		}
		}
		
		
