//Create an Interface payable with method getAmount ().Calculate the amount to be
//paid to Invoice and Employee by implementing Interface.
import java.util.*;

interface paayable{
	int  getamout();
 }
 
class employee implements paayable {
 	 int amount;
 	 public employee (int amount){
 	 this.amount=amount;
 	 }
 	public int getamount(){
 	 return amount;
 	 }
 	 }
 	 
 	 
 	 public class payable{
 	 public static void main(String[] args ){
 	 Scanner sc=new Scanner(System.in );
 	 
 	 System.out.println("enter the amouont of the amployee ");
 	 int a=sc.nextInt();
 	 
 	 employee n=new employee(a);
 	 System.out.println("the salary of the amployee is :: "+n.getamount ());
 	 }
 	 }
 	 
 	 
  



