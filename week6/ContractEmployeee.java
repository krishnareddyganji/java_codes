/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary. Also
override getDesig () method depending on the type of contract employee.*/


import java.util.*;
class HourlyEmployee{
	int no_hours;
	int no_wagesPerHour;
	String designation;
	int  calculateWages(int hours,int wages){
	return hours*wages;
	
	
	}
	String getDesig (){
	return designation;
	
	}
	void setDesig (String s1){
	designation=s1;
	}
	

}

class  WeeklyEmployee extends HourlyEmployee{
	
	int no_weeks;
	int no_wagesPerWeek;
	String designation;
	
	int  calculateWages(int weeks,int wages){
	return weeks*wages;
	}
	String getDesig (){
	return designation;
	
	}
	void setDesig (String s2){
	designation=s2;
	}
	
}

 public class ContractEmployeee{
 	public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
 
  	System.out.println("enter the no. of hours  and no.of wages of HOURLY EMPLOYEEE ");
  		int hh=sc.nextInt();
  		int wh=sc.nextInt();
  	sc.nextLine();	
  	System.out.println("enter the designation of the hourly emppolyee ");
  	String desig2=sc.nextLine();
  	
  	
  	System.out.println("enter the no. of weeks  and no.of wages of WEEKLY  EMPLOYEEE ");
  		int hw=sc.nextInt();
  		int ww=sc.nextInt();
  	sc.nextLine();	
  	System.out.println("enter the designation of the weekly emppolyee ");
  	String desig1=sc.nextLine();
  	sc.next();
  	
  	
  	
  	HourlyEmployee H=new HourlyEmployee();
  	WeeklyEmployee W=new  WeeklyEmployee();
  	
  	H.setDesig (desig1);
  	W.setDesig (desig2);
  	
  	System.out.println("the total wages of the hourly employee:: "+H.calculateWages(hh,wh));
  	System.out.println( "th designation of the employee is:: "+H.getDesig ());
  	
  	System.out.println("the total wages of the weekly s employee :: "+W.calculateWages(hw,ww));
  	System.out.println( "th designation of the employee is::"+W.getDesig ());
  	}
  	}
  		
  



