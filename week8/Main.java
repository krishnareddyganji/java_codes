interface MyInterface { 
	void myMethod(); 
}
 
class MyClass implements MyInterface { 
	public void myMethod() { 
		System.out.println("Method implementation in MyClass."); 
	} 
} 
public class Main { 
	public static void main(String[] args) { 
		MyClass obj = new MyClass(); 
		obj.myMethod(); 
	} 
}

