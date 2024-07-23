/*1. Write a Java program to find Area and perimeter of different shapes using polymorphism
concept*/
import java.util.*;

 abstract  class area{
abstract int  findarea();
}

class rectangle extends area{
int length;
int breadth;
public int Rectangle(int length,int breadth){
this.length=length;
this.breadth=breadth;
return 0;
}

int findarea()
{
return length*breadth;
}
}

 class Main{
public static void main(String [] args){

rectangle c=new rectangle();
System.out.println(c.Rectangle(4,6));
System.out.println(c.findarea());
}
}






