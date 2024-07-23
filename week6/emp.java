/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively.*/
import java.util.*;

class Employee{
	String first_name;
	String last_name;
	String getFirstName()
	{
		return first_name;
	
	}
	String getLastName(){
		return last_name;
	}
	void  setLastName(String lname){
		last_name=lname;
	
	}
	void setFirstName(String fname){
		first_name=fname;
	
	}
}

class ContractEmployee extends Employee{
		String department;
		String designation;
		int salary;
	String  displayFullName()
	{
		return first_name+last_name;
	}
	String getDepartment(){
		return department;
	}
	void setDepartment(String dept){
		department=dept;	
	}
	
	String getDesig(){
		return designation;
	
	}
	
	void setDesig( String desig){
		designation=desig;
	
	}
	void setsalary(int salary){
		this.salary=salary;
	}
	int getsalary(){
	return salary;
	
	}


}

class RegularEmployee extends Employee{
		String department;
		String designation;
		int salary;
	String  displayFullName(){
		return first_name+last_name;
	}
	String getDepartment(){
		return department;
	}
	void setDepartment(String dept){
		department=dept	;
	}
	void setDesig(String desig){
		designation=desig;
	}
	String  getDesig(){
		return designation;
	
	}
	void setsalary(int salary ){
	this.salary=salary;
	}
	int getsalary(){
	return salary;
	}
	
	
}

public class emp{
public static void main(String [] args){

	Employee e=new Employee();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first name  ");
	String fname=s.nextLine();
	e.setFirstName(fname);
	System.out.println("enter the last  name  ");
	String lname=s.nextLine();
	e.setLastName(lname);
	
	ContractEmployee c=new ContractEmployee();
	RegularEmployee   b=new RegularEmployee();
	
	System.out.println("enter the Department   name of contract employee  ");
	String dept1=s.nextLine();
	c.setDepartment(dept1);
	System.out.println("enter the designation  name of contract employee  ");
	String desig1 =s.nextLine();
	c.setDesig(desig1);
	System.out.println("enter the salary of contract employee  ");
	int sal1=s.nextInt();
	c.setsalary(sal1);
	
	System.out.println("enter the Department   nacme of regular employee ");
	String dept2=s.nextLine();
	b.setDepartment(dept2);
	s.next();
	System.out.println("enter the designation  name  of regular employee");
	String desig2 =s.nextLine();
	b.setDesig(desig2 );
	s.next();
	System.out.println("enter the salary of regular employee  ");
	int sal2=s.nextInt();
	b.setsalary(sal2);
	
	System.out.println(e.getFirstName()+""+e.getLastName());
	System.out.println("the Department   name of contract employee  "+c.getDesig());
	System.out.println("the Department   name of contract employee "+c.getDepartment());
	System.out.println(" the salary of contract employee  "+ c.getsalary());
	System.out.println("the designation  name  of regular employee"+b.getDesig());
	System.out.println("the Department   name of regular employee "+b.getDepartment());
	System.out.println(" the salary of regular employee  "+ b.getsalary());
	


	
	

}
}















	

