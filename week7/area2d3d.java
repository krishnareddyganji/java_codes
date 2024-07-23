//1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
//shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
//and volume of square ,circle ,cube and sphere
import java.util.*;

abstract class  shape {
         abstract double getarea();
	 abstract double   getvolume();
	}
	
        class square extends shape  {
	double side;
	
	square(double side ){
	this.side=side;
	}
	
	double getarea(){
	return side*side;
	}
	double getvolume(){
	return 0;
	}
	
	}
	
	class circle extends shape {
	double radius;
	
	public circle(double radius){
	this.radius=radius;
	}
	double getarea(){
	return  Math.PI*radius*radius;
	}
	double getvolume(){
	return 0;
	}
	
	}
	
	class cube extends shape {
	double side;
	public cube(double side){
	this.side=side;
	}
	
	double getvolume(){
	return side*side*side;
	}
	double getarea(){
	return side*side;
	}
	}
	
	class sphere extends shape {
	double radius;
	public sphere(double radius){
	this.radius=radius;
	}
	double getarea(){
	return 4*Math.PI*radius*radius ;
	}
	double getvolume(){
	return (4/3)*Math.PI*radius*radius*radius;
	}
	
	
	
	}
	
	
	public class area2d3d{
	 public static void main(String [] args){
	     
		square s=new square(10);
		circle c=new circle(10);
		cube k=new cube(5);
		sphere sp=new sphere(6);
		System.out.println("the area of square :: "+s.getarea());	
		System.out.println("the area of circle :: "+c.getarea());	
		System.out.println("the volume of cube ::"+k.getvolume());	
		System.out.println("the area of the cube::"+k.getarea());	
		System.out.println("the surfacearea of sphere:: "+sp.getarea());	
		System.out.println("the volume of the sphere :: "+sp.getvolume());	
			
			}
			
			}
			
	 
	
	
	
