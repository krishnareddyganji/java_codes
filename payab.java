/*Create an Interface payable with method getAmount ().Calculate the amount to be
paid to Invoice and Employee by implementing Interface.*/
import java.util.*;
interface payable{
 	int getamount();
	
	}
	
	class payab implements payable{
		int amount;
		void setamount(int amount){
		this.amount=amount;
		}
		public int getamount(){
		return amount;
	       }
	
 	public static void main (String [] args){
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter the amount to account");
 		int a=sc.nextInt();
 		payab e=new payab();
 		e.setamount(a);
 		System.out.println(e.getamount());
 	}
 	}
 	
