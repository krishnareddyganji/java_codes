
/*Create an Interface Vehicl with method getColor(),getNumber(), getConsumption() calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By implementing interface Vehicle.*/
import java.util.*;
interface vehicle{
	String getcolor();
	String getname();
	double getfuel();
	}
	
	class twowheeler implements vehicle{
	double fuel;
	String name;
	String color;
	
	twowheeler(String name,String color,double fuel){
	this.fuel=fuel;	
	this.name=name;
	this.color=color;
	
	}
	public String getcolor(){
	return color;
	}
	public String getname(){
	return name;
	}

	public  double getfuel(){
	return fuel;
	}
	
	
	}
	
	class fourwheeler implements vehicle{
	double fuel;
	String name;
	String color;
	fourwheeler(String name,String color,double fuel){
	this.fuel=fuel;	
	this.name=name;
	this.color=color;
	}
	public String getcolor(){
	return color;
	}
	public String getname(){
	return name;
	}

	public double getfuel(){
	return fuel;
	}
	
	
	
	}
	
	class vechileinterface{
	public static void main(String [] args ){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name,color and fuel of the two wheeler");
	String name1=sc.nextLine();
	String color1=sc.nextLine();
	double fuel1=sc.nextDouble();
	twowheeler tw=new twowheeler(name1,color1,fuel1);
	tw.getcolor();
	tw.getname();
	tw.getfuel();
	
	
	System.out.println("enter the name,color and fuel of the four wheeler");
	String name2=sc.nextLine();
	String color2=sc.nextLine();
	double fuel2=sc.nextDouble();
	fourwheeler fw=new fourwheeler(name2,color2,fuel2);
	fw.getcolor();
	fw.getname();
	fw.getfuel();
	
	
	
	
	}
	}
	
