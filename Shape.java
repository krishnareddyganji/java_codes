package org.shapes;
import java .lang.Thread;

public class Shape{
public static void main(String [] args ){
Square s=new Square();
s.square();
try{
Thread.sleep(2000);
Triangle t= new Triangle();
t.triangle();
Thread.sleep(3000);
Circle c=new Circle();
c.circle();
}
catch(Exception e){
System.out.println(e);
}
}
}

