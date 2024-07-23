/*4. Create a class Account with an instance variable balance (double). It shouldcontain a
constructor that initializes the balance, ensure that the initial balance is
greater than 0.0.
Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance.
The Credit adds the amount (passed as parameter) to balance and does not return any
data. Debit method withdraws money from an Account. GetBalance displays the
amount.*/
import java.util.*;

 public class Account{
	double balance;
	static String Acct_Name="krishna reddy ";
	static int Acct_acctno=200596;
	static String Acct_Address="YADHADRI BONGIR  ";
	int Acct_Bal;
	int money;
	
	
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	
	Account a=new Account();
	
	while(true){
	System.out.println("");
	
	System.out.println("---------------MENU-------------");
	System.out.println("enter 1 for credit  from your bank ");
	System.out.println("enter 2 for dedit  from your bank ");
	System.out.println("enter 3 to get bank balance");
	System.out.println("enter 4 to get bank details  ");
	System.out.println("5 for exit ");
	System.out.println("");
	int n=sc.nextInt();
	switch(n){
		case 1 :
			System.out.println("enter the money to credit from the bank ");
			a.money=sc.nextInt();		
				a.credit(a.money);
		break;
		case 2 :System.out.println("enter the money to debit  from the bank ");
			a.money=sc.nextInt();		
				a.debit(a.money);
		break;
		case 3 :a.get_balance();
		break;
		case 4:a.acc_details();
		break;
		case 5 :System.exit(0);
		break;
	
	
	
	
	}
	}
	}
	void credit(int money){
	
	if(Acct_Bal>money){
		Acct_Bal=Acct_Bal-money; 
		System.out.println("successfully"+ money +" credited from your bank ");
		}
		else{
		System.out.println("not sufficient balance in your account");
		}
	
	
	}
	
	
	void debit(int money){
	Acct_Bal=Acct_Bal+money;
	System.out.println("successfully"+ money +" debit from your bank ");
	
	
	}
	
	void get_balance(){
	System.out.println("the total balance in your account is "+ Acct_Bal);

	
	}
	void acc_details(){
	System.out.println(Acct_Name +" "+ Acct_acctno +""+Acct_Address +"");
	
	
	}
	}
	
		
