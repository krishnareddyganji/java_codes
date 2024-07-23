import java.util.*;
class checks extends Thread{
	
	public void run(){
	int i=1;
	while(i<10){
	try{
	Thread.sleep(1000);
	System.out.println("production not over");
	i++;
        }
	catch(Exception e){}	
	}
	System.out.println("production over ");
	}
	
	}
	
	class check extends Thread{
	
	public void run(){
	int i=1;
	while(i<10){
	try{
	Thread.sleep(1000);
	System.out.println("production not over");
	i++;
        }
	catch(Exception e){}	
	}
	System.out.println("production over ");
	}
	
	}
	
	
	
	
	public class consumer{
		public static void main(String [] args){
		
		checks c1=new checks();
		check c2=new check();
		c1.start();
		try{
		Thread.sleep(1000);
		}
		catch(Exception e){}
		c2.start();
		
		
		}
		}
