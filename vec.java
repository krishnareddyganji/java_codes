import java.util.*;

class vec{
	public static void main(String[] args){
	
	Vector<Integer>v=new Vector<Integer>();
	System.out.println("this is my first vector programe");
	System.out.println("enter the elements in to the vector");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
	v.addElement(sc.nextInt());
	}
	v.remove(3);
	System.out.println(v.capacity());
	System.out.println(v);


	//v.charAt();
	
   /* Vector add() Method in Java.
    Vector set() Method in Java.
    Vector remove() Method in Java.
    Vector get() Method in Java.
    Vector addAll() Method in Java.
    Vector addElement() Method in Java.
    Vector capacity() Method in Java.*/

	
	
	}
	}
