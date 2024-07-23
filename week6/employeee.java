
import java.util.*;

class calculateSalary{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	employee e=new employee();
	int a[]=new int[3];
	employee array[]=new employee[3];
	
	for(int i=0;i<3;i++){
	array[i]=new employee();
	System.out.println("enter the salary of the employee");
	e.salary=sc.nextDouble();
	
	System.out.println("enter the name of the employee");
	e.name=sc.nextLine();
	sc.next();
	
	
	System.out.println("enter the country name of the employee");
	e.country=sc.nextLine();
	sc.next();
	  t_salary t=new  t_salary();
	System.out.println(t.t_salary());
	
	}
	}
	} 
	
	
	
	
	class employee{
	String name;
	double salary;
	String country;
	int sal;
	}
	
	int  t_salary()
	{
	System.out.println("enter the country name");
	String s=sc.nextLine();
	for(int j=0;j<3;j++){
	if(array[i]==s){
	sal=sal+array[i];
	
	}
	
	}
	return sal;
 }
	
