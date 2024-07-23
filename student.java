import java.util.*;

interface studentfee{
	String getfirstname();
	String getlastname();
	int getamount();
	String getaddress();
	String 	 getcontact();
	}
	
	class hosteler implements studentfee{
		String firstname;
		String lastname;
		String address;
		int    amount;
		String   contact; 
		void setdata(String firstname,String lastname ,String address,int amount,String  contact){
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.amount=amount;
		this.contact=contact;
		}
		
		
		public String getfirstname(){
		return firstname;
		
		}
		
		public String getlastname(){
		return lastname;
		}
		
		public int getamount(){
		return amount;
		}
		public String getaddress(){
		return address;
		
		}
		public String  getcontact(){
		return contact;
		} 
		
		
		
		}
	
	      class nonhostler implements studentfee{
		String firstname;
		String lastname;
		String address;
		int    amount;
		String  contact;
		
		void setdata(String firstname,String lastname ,String address,int amount,String  contact){
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.amount=amount;
		this.contact=contact;
		}
		
		public String getfirstname(){
		return firstname;
		
		}
		
		public String getlastname(){
		return lastname;
		}
		
		public int getamount(){
		return amount;
		}
		public String getaddress(){
		return address;
		
		}
	       public  String getcontact(){
		return contact;
		} 
		
		
		}
	
	public class student{
	public static void main(String [] args){
	hosteler h=new hosteler();
	h.setdata("krishna "," reddy ","motakondur",20000,"7780614110");
	System.out.println(h.getfirstname());
	System.out.println(h.getlastname());
	System.out.println(h.getaddress());
	System.out.println(h.getamount());
	System.out.println(h.getcontact());
	
	hosteler nh=new hosteler();
	nh.setdata("mamidi "," vardhan ","dharmaram",40000,"7075484861");
	System.out.println(nh.getfirstname());
	System.out.println(nh.getlastname());
	System.out.println(nh.getaddress());
	System.out.println(nh.getamount());
	System.out.println(nh.getcontact());
	
	
	}
	}
	
	
	
