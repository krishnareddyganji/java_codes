/*1. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary, Emp_Address etc.,*/
import java.util.*;
class employee{
                int emp_id;
                String emp_name;
		int emp_age;
		int emp_salary;	
		String emp_address;
					
	public static void main(String [] args){
	        System.out.println("enter the no.of employee required");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		employee emplist[]=new employee[n];
		int i;
		
		for(i=0;i<n;i++){
		
			emplist[i]=new employee();
		
			System.out.println("enter the detail of"+" ::"+i+1);
			
			System.out.print("enter the id ::");
			emplist[i].emp_id=sc.nextInt();
			
			System.out.print("enter the age ::");
			emplist[i].emp_age=sc.nextInt();
			
			System.out.print("enter the salary :: ");
			emplist[i].emp_salary=sc.nextInt();
		
	 		System.out.print("enter the name ::");
			emplist[i].emp_name=sc.nextLine();
			sc.next();
			
			
			System.out.print("enter the address ::");
			emplist[i].emp_address=sc.nextLine();
			sc.next();
			}
			
			
		System.out.print("enter the id of the employee :: ");
		int id=sc.nextInt();
		for(i=0;i<n;i++){
		
			if(emplist[i].emp_id==id){
			System.out.println(emplist[i].emp_id);
			System.out.println(emplist[i].emp_name);
			System.out.println(emplist[i].emp_age);
			System.out.println(emplist[i].emp_salary);
			System.out.println(emplist[i].emp_address);
		}
		}	
		}
		}
		
