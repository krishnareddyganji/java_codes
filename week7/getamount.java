//Create an abstract class Employee with methods getAmount() which displays the
//amount paid to employee. Reuse this class to calculate the amount to be paid to
//WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
//for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.


abstract class employee{
	 abstract double getamountt();
	}
	class HourlyEmployee extends employee{
	 	float hours;
	 	int wages;
	  	HourlyEmployee(int hours,int wages ){
	 	this.hours=hours;
	 	this.wages=wages;
	 	}
	 	
	 double getamountt(){
	 return hours*wages;
	 
	 }
	}
	class WeeklyEmployeed extends employee{
		float weeks;
		int wages;
		public WeeklyEmployeed (int weeks,int wages){
		this.weeks=weeks;
		this.wages=wages;
		}
	double getamountt(){
	 return weeks*wages;
	 }
	
	}
	
	
	public class getamount{
		public static void main(String [] args){
		HourlyEmployee HE=new HourlyEmployee(10,200);
		WeeklyEmployeed WE=new WeeklyEmployeed (5,1000);
		System.out.println(HE.getamountt());
		System.out.println(WE.getamountt());
		}
		}
