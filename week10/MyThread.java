import java.util.*;
 class Mythread extends Thread{
	
	public void run(){
	for(int i=0;i<5;i++){
	try{
	Thread.sleep(1000);
	System.out.println("MyThread");
	}
	catch(Exception e){}
	
	}
	}
	}
public class MyThread{	
public static void main(String [] args){

	Mythread m=new Mythread();
	m.start();
	}
	}

