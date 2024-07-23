//Write an application to create a super class Vehicle with information vehicle
//number,insurance number,color and methods getConsumption() displayConsumption().
//Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
//average() to print the maintenance And average of vehicle.

class Vehicle{
	
 	int vehicle_number;
 	int insurance_number;
 	String color;
 	int fuel;
 	void setinfo(int vn,int in,String color){
 	vehicle_number=vn;
 	insurance_number=in;	
 	this.color=color;
 	}
 		void getConsumption(int fuel){
 		this.fuel=fuel;
 		}
 		int displayConsumption(){
 		return fuel;
 		}
 		void getinfo(){
 		System.out.println("details of the vehicle is ::: ");
 		System.out.println(vehicle_number);
 		System.out.println(insurance_number);
 		System.out.println(color);
 		
 		}
 		}
 	
 		 class  TwoWheeler extends Vehicle {
 		  	double mt;
 		  	double avg; 		  	
 		  	void set_m_a(double m,double a){
 		  	mt=m;
 		  	avg=a;
 		  	}
 		 	double maintenance(){
 			 	return mt;
 		 	}	
 		 	double average(){
 				return avg;
 		 	}
 		 	}
 		 
 		 class  FourWheeler extends Vehicle{
 		   double mt;
 		   double avg; 
 		   void set_m_a(double m,double a){
 		   mt=m;
 		   avg=a;
 		   }
 		   double maintenance(){
 		   	return mt;
 		   }
 		   double average(){
 		 	return avg; 
 		 }
 		 }
 
 		 
 		 class vehiclema{
 		 public static void main(String [] args){
 		 TwoWheeler tw=new TwoWheeler();
 		 FourWheeler fw=new FourWheeler();
 		 
 		 System.out.println("for two wheelers");
 		 tw.setinfo(1234,7780,"red");
 		 tw.getConsumption(20);
 		 tw.set_m_a(22,19);
 		 tw.getinfo();
 		 System.out.println("the maintence of the two wheeler "+tw.maintenance());
 		 System.out.println("the average maintance   of the two   wheeler "+tw.average());
 		 
 		 
 		 
 		 
 		 System.out.println("for four whelers");
 		 fw.setinfo(5678,9618,"blue");
 		 fw.getConsumption(40);
 		 fw.set_m_a(27,16);
 		 fw.getinfo();
 		 System.out.println("the maintence of the four wheeler "+fw.maintenance());
 		 System.out.println("the average maintance   of the four  wheeler "+fw.average());
 		 
 		 }
 		 }
 		 
 		 
 		 
 		 
