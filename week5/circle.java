import java.util.*;

class circle{
 	double 	pi=3.14;
 	
 	
    public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
 	System.out.println("enter the radius of the circle  ");
 	double radius=sc.nextDouble();
 	circle obj=new circle();
 	double areaOfCircle=obj.circlearea(radius);
 	System.out.println(areaOfCircle);
 	double periOfCircle=obj.circleperimeter(radius);
 	System.out.println(periOfCircle);
 	}
 	
 	
 	double circlearea(double r){
 		double area=pi*r*r;
 		return area;
 		}
 	double circleperimeter(double r){
 	        double perimeter=2*pi*r;
 	        return perimeter;
 	   
 	}
 		}
 	
 	
 	
