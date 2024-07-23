import java.util.*;

class apple{
 String color="red";
 int weight=20;
 int height=10;
 
 public static void main(String [] a){
 
  Scanner sc=new Scanner(System.in);
  apple obj=new apple();
  System.out.println("enter the color of the apple"); 
  obj.color=sc.nextLine();
  System.out.println("enter the weight of the apple"); 
  obj.weight=sc.nextInt();
   System.out.println("enter the height of the apple");
   obj.height=sc.nextInt();
   
    System.out.println(obj.color+ " " + obj.weight+ " "+ obj.height);
    }
    }
      
 
 
