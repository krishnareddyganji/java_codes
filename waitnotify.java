class thread
 
      {
	int amount=100;
	synchronized void withdraw(int amount){	
	System.out.println("going to withdraw.....");
		try{Thread.sleep(2000);}catch(Exception e){}
		if(this.amount<amount){
		System.out.println("low balance ");
		try{Thread.sleep(2000);}catch(Exception e){}
		try{ wait();}catch(Exception e){}
		}
		this.amount-=amount;
		try{Thread.sleep(2000);}catch(Exception e){}
		System.out.println(" amount withdrawn successfully");
		}
		
	synchronized void diposit(int amount){
		this.amount+=amount;
		System.out.println("amount deposit successfully");
		notify();
		}
	}


public class waitnotify{	
	public static void main(String [] args){
	
	thread t=new thread();
	
	new Thread(){
	public void run(){
	t.withdraw(500);
	}}.start();
	
	try{Thread.sleep(2000);}catch(Exception e){}
	
	
	new Thread(){
	public void run(){
	t.diposit(500);
	}}.start();
	
	}
	}
	
	
	
