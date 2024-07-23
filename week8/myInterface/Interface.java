package myInterface;
class Interface implements anInterface{
	
	public 	void display(){
		System.out.println("display method");
		}
public static void main(String [] args){
	Interface i=new Interface();
	i.display();
	System.out.println("the value of a is "+a);
	System.out.println("code executed sucessfuly");
	}
	}

