class getTicket extends Thread{
	 public void run(){
	 int c=0;
	 while(c<5){
	 System.out.println(c++ +"person ticket taken");
	 }
	 }
	 }
	 class getentry extends Thread{
	 public void run(){
	 int c=0;
	 while(c<5){
	 System.out.println(c++ +"person entered");
	 }
	 }
	 }
	 
	 

       public class MovieTheater extends Thread{
   
        
	public static void main(String [] args){
	getTicket c1=new getTicket();
	getentry  c2=new getentry ();
	
	
	c1.start();
	
	int c=0;
	while(c<5){
	System.out.println (c++ +" person entered");
	}
	c2.start();
	
	

	}
	}
