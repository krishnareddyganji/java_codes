/*1. Write a Java program to find Area and perimeter of different shapes using polymorphism
concept*/
import java.util.*;

 abstract  class area{
abstract int  findarea();
void display(){
System.out.println("hello");
}
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

class square extends area{
int side;

public int Square(int side){
this.side=side;

return 0;
}

int findarea()
{
return side*side;
}
}

 class Main{
public static void main(String [] args){

rectangle c=new rectangle();
c.Rectangle(4,6);
System.out.println(c.findarea());
c.display();
square q=new square();
q.Square(5);
System.out.println(q.findarea);
}
}






