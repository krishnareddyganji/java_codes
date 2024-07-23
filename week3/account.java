import java.util.*;

 public class account{
	int amount;
	int accountnumber;
	String accountname;
	
		
		
	public static void main(String[] args ){
	
	account c=new account();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ente the name of the account holder");
	c.accountname=sc.nextLine();
	System.out.println("enter the account number");
	c.accountnumber=sc.nextInt();
	
	
	while(true)
	       {
		System.out.println(" __ENTER __");
		System.out.println(" 1 for deposit ");
		System.out.println("2 for get the balance");
		System.out.println("3 for with draw :: ");
		System.out .println("4 for exit ");
		int s=sc.nextInt();
		
		switch(s){
		
		case 1:
			System.out.println("enter diposit money");
			int di_money=sc.nextInt();
			c.diposite(di_money);
			break;
		case 2:c.getbalance();
		break;
		case 3:System.out.println("enter the money  you have to withdraw ::");
			int w=sc.nextInt();
			
			if(w<c.amount){
			c.withdraw(w);
			}
			
			else{
			System.out.println("zero balance");
			}
			break;
			
		case 4:System.exit(0);
		}
		
		}
		
		}
		
		void diposite(int di_money){
		amount=amount+di_money;
		}
		
		void getbalance(){
			System.out.println(accountname );
			System.out.println(accountnumber);
			if(amount<=0){
			System.out.println("insufficient balance ");
			}
		        else{
			System.out.println("amount in the account ::"+amount);
		}
		}
		void withdraw(int w){
		amount=amount-w;
		}
		
		}
