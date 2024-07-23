import java.util.*;
class thisoperator{
	int a;
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		thisoperator o=new thisoperator();
		o.meth(a);
		}
					
		void  meth(int a){
		this.a=a;
		System.out.println(a);
	}
	}
	
	
