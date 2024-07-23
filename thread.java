package Java.threads;

class first extends Thread{
	public void run(){
	for(int i=0;i<5;i++){
	try{
	System.out.println("hii");
	Thread.sleep(1000);
	}
	catch(Exception e){}
	}}}

class second extends Thread{
     public  void run(){
      for(int i=0;i<5;i++){
      try{
	System.out.println("hello");
	Thread.sleep(1000);
	}
	catch(Exception e){}
      }}}


public class thread{
public static	 void main(String [] args){
first f=new first();
second s=new second();
start() t=new start();
f.t();
try{
Thread.sleep(500);
}
catch(Exception e){}
s.start();
}}
