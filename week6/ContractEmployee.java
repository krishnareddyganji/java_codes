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
	return " ";
	
	}
	void setDesig (){
	
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
	return " ";
	
	}
	void setDesig (){
	
	}
	
}

 class ContractEmployee{
 	public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
 
  	System.out.println("enter the no. of hours  and no.of wages of HOURLY EMPLOYEEE ");
  		int hh=sc.nextInt();
  		int wh=sc.nextInt();
  	
  	System.out.println("enter the no. of weeks  and no.of wages of HOURLY EMPLOYEEE ");
  		int hw=sc.nextInt();
  		int ww=sc.nextInt();
  	HourlyEmployee H=new HourlyEmployee();
  	System.out.println(H.calculateWages(hh,wh));
  	WeeklyEmployee W=new  WeeklyEmployee();
  	System.out.println(W.calculateWages(hw,ww));
  	}
  	}
  		
  



