
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
	
	
	
	
	}
	}
	
	
	
	
	
	int  cal_salary()
	{
return 0;
	}
	}
	
	
	
	
	class employee{
	String name;
	double salary;
	String country;
	}
	
