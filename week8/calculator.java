package cal;
import java.util.*;

public class calculator{
	public static void main(String [] args){
	addition ad=new addition();
	subtraction s= new subtraction ();
	multiplication m=new multiplication();
	division di=new division();
	
	Scanner sc =new Scanner(System.in);
	while(true){
	System.out.println("MENU ");
	System.out.println("1. addition ");
	System.out.println("2. subtraction  ");
	System.out.println("3. multiplication ");
	System.out.println("4. dividion ");
	System.out.println("5. exit");
	
	int k=sc.nextInt();
	
	switch(k){
	case 1:System.out.println("enter the two values ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ad.add(a,b);
	break;
	case 2:System.out.println("enter the two values ");
		int c=sc.nextInt();
		int d=sc.nextInt();
		s.sub(c,d);
	break;
	case 3:System.out.println("enter the two values ");
		int e=sc.nextInt();
		int f=sc.nextInt();
		m.multi(e,f);
	break;
	case 4:System.out.println("enter the two values ");
		int g=sc.nextInt();
		int h=sc.nextInt();
		di.divid(g,h);
	break;
	case 5:System.out.println("successfully executed ");
	System.exit(0);
	}
	}
	}
	}
	
	
	
	
