/*Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere*/
import java.util.*;
abstract class shape{

	abstract double getarea();
	abstract double getvolume();
}



class square extends shape{
	int side;
 	square(int side){
 	this.side=side;
 	}
 	
 	public double getarea(){
 	return side*side;
 	}
 	double getvolume(){
 	return 0;
 	}
 	}
 class cube extends shape{
 	int side;
 	cube(int side){
 	this.side=side;
 	}
 	double getarea(){
 	return 6*side;
 	}
 	double getvolume(){
 	return side*side*side;
 	}
 	}
 	
 class circle extends shape{
       double radius;
       circle(double radius){
       this.radius=radius;
       }
       double getarea(){
       return 3.14*radius*radius;
       }
       double getvolume(){
 	return 0;
 	}
       }
       
 public class shapes2d3d{
       public static void main (String [] args){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the side of the square");
       int n=sc.nextInt();
       square s=new square(n);
       System.out.println("the area of the squrea is::"+s.getarea());
       
       
       System.out.println("enter the side of the cube");
       int m=sc.nextInt();
       cube c=new cube(m);
       System.out.println("the area of the cube is::"+ c.getarea());
       System.out.println("the volume of the cube is::"+ c.getvolume());
       
       
       System.out.println("enter the side of the circle");
       int l=sc.nextInt();
       circle C=new circle(l);
       System.out.println("the area of the circle is::"+C.getarea());
       System.out.println("successfully executed ");
       
       
       
       }
       }
       
       
        	
