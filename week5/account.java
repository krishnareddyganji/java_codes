/*4. Create a class Account with an instance variable balance (double). It shouldcontain a
constructor that initializes the balance, ensure that the initial balance is
greater than 0.0.
Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance.
The Credit adds the amount (passed as parameter) to balance and does not return any
data. Debit method withdraws money from an Account. GetBalance displays the
amount.
Ensure that the debit amount does not exceed the Account’s balance. In that case the
balance should be left unchanged and the method should print a message indicating
“Debit amount exceeded account balance”.*/
import java.util.*;
class Account{
	double balance;
	String acct_name;
	int acct_no;
	double acct_bal;
	String acct_address;
	
	Account(double balance){
	this.balance=balance;
	}
	
	void credit(double m){
	acct_bal=acct_bal+m;
	}
	
	void debit(double d){
	if(acct_bal<d){
	System.out.println("Debit amount axceeded account balance                                                             ");
	}
	else{
	acct_bal=acct_bal-d;
	}
	}
	
	double Getbalance(){
	System.out.println(acct_name+"\n"+ acct_no +"\n"+acct_address);
	
	return acct_bal;
	}
	}
	
	class account{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Account A=new Account(10);
	System.out.println("enter the name of the customer");
	A.acct_name=sc.nextLine();
	System.out.println("enter the account number of the customer");
	A.acct_no=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the address of the customer");
	A.acct_address=sc.nextLine();
	
	while(true){
	
	System.out.println("enter the option given in the menu ");
	System.out.println("1 for debit");
	System.out.println("2 for credit");
	System.out.println("3 fro get the balance ");
	System.out.println("exit from programe");
	int n=sc.nextInt();
	
	switch(n){
	
	case 1:System.out.println("enter the amount debit from the account");
		double a=sc.nextDouble();
		A.debit(a);
		break;
	case 2:System.out.println("enter the ampount credit from the account");
		double b=sc.nextDouble();
		A.credit(b);
	break;
	case 3:System.out.println(A.Getbalance());
	break;
	case 4:System.exit(0);
	break;
	}
	}
	}
	}
	
	
	
	
	
	
	
	
