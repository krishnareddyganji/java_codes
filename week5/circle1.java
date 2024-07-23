/*2. Write an application that prompts the user for the radius of a circle and uses a
method called circleArea to calculate the area of the circle and uses a method
circlePerimeter to calculate the perimeter of the circle.*/
import java.util.*;

class circle1{
	double radius;

	double circleArea(){
	return math.PI*radius*radius;
	
	}
	double circlePerimeter(){
	return  2*math.PI*radius*radius;
	}

	circle1(int radius){
	this radius =radius;
	}
	
	}
	public class circle{
	public static void main(String [] rags){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius of the circle ");
	double rad=sc.nextInt();
	circle1 c=new circle(rad);
	System.out.println(c.circleArea());
	System.out.println(c.circlePerimeter());
	}
	}
		
