import java.util.*;
/*public class user extends admin{
public static void main(String [] args){
int a[]=new int[5];
a[0]=2;
a[1]=8;
a[4]=4;
a[3]=22;
a[2]=54;
Arrays.sort(a);

for(int x:a){
    System.out.println(x);
}
int b[]=new int[5];
int c=0;

for(int i=4;i>0;i--){
    b[c]=a[i];
    c++;
}
for(int y:b){
    System.out.println(y);
}
}
}

interface i1{
	void m1(){ 
	System.out.println("this is class 1");
	}
	}
	
	interface  i2{
	void m2(){
		System.out.println("this is class 2");
	}
	}
	public class i3 extends i1{
	public static void main(String ag[]){
	i1 i=new i1();
	
	i.m1();
	
	}
	}*/
	

	/* 46 Create an Interface Fare with method getAmount() to get the amount paid for fare of travelling.
 Calculate the fare paid  by bus and train implementing interface Fare. */
 interface Fare
 {
	double getAmount();
 
 }
 class Bus implements Fare
 {
	double fare;
	double food;
	double sleeper;
	void setFare(double fare,double food,double sleeper)
	{
		this.fare=fare;
		this.food=food;
		this.sleeper=sleeper;
	}
	public double getAmount()
	{
		return (fare+food+sleeper);
	}
 
 
 }
 class Train implements Fare
 {
	double fare;
	double food;
	double sleeper;
	void setFare(double fare,double food,double sleeper)
	{
		this.fare=fare;
		this.food=food;
		this.sleeper=sleeper;
	}
	public double getAmount()
	{
		return (fare+food+sleeper);
		
	}
 
 
 }
 public class fare1
 {
	public static void main(String args[])
	{
		Bus b=new Bus();
		b.setFare(700.50,200.50,300.50);
		double amount=b.getAmount();
		System.out.println("\n Total Amount is : "+amount);
		Train t=new Train();
		t.setFare(1000.50,100.50,200.50);
		amount=t.getAmount();
		System.out.println("\n Total Amount is : "+amount);
	
	
	
	
	}
 
 
 
 }

