//Write an application to create a super class Vehicle with information vehicle
//number,insurance number,color and methods getConsumption() displayConsumption().
//Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
//average() to print the maintenance And average of vehicle.

Vehicle{
	
 	int vehicle_number;
 	int insurance_number;
 	String color;
 	int fuel;
 	void setinfo(int vn,int in,String color){
 	vehicle_number=vn;
 	insurance_number=in;
 	this.color=color;
 	}
 		int getConsumption(int fuel){
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
 	
 		 class  TwoWheeler extends vehicle {
 		  	int mt;
 		  	int avg;
 		  	void set_m_a(double m,double a){
 		  	mt=m;
 		  	avg=a;
 		  	}
 		 	void  maintenance(){
 			 	return m;
 		 	}	
 		 	void average(){
 				return a;
 		 	}
 		 	}
 		 
 		 class  FourWheeler extends vehicle{
 		   int mt;
 		   int avg; 
 		   void set_m_a(double m,double a){
 		   mt=m;
 		   avg=a;
 		   void  maintenance(){
 		   	return m;
 		   }
 		   void average(){
 		 	return a; 
 		 }
 		 }
 		 
 		 class vechile_m_a{
 		 public static void main(String [] args){
 		 TwoWheeler tw=new TwoWheeler();
 		 FourWheeler fw=new FourWheeler();
 		 
 		 System.out.println("for two wheelers");
 		 tw.setinfo(1234,7780614110,red);
 		 tw.getConsumption(20);
 		 tw.set_m_a(22,19);
 		 tw.getinfo();
 		 System.out.println(tw.maintenance());
 		 System.out.println(tw.average());
 		 
 		 
 		 
 		 
 		 System.out.println("for four whelers");
 		 fw.setinfo(5678,9618749598,blue);
 		 fw.getConsumption(40);
 		 fw.set_m_a(27,16);
 		 fw.getinfo();
 		 System.out.println(fw.maintenance());
 		 System.out.println(fw.average());
 		 
 		 
 		 
 		 
 		 
 		 }
 		 
 		 }
 		 
 		 
 		 
 		 
