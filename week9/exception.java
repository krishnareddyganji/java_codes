import java.io.FileNotFoundException;
public class Main{

	Main(String msg) {
	msg = "I AM JAVA";
	System.out.println(msg);
	}
	
public static void main(String[] args)
	throws Exception {
	try {
		
	throw new FileNotFoundException();
	} 
	catch (FileNotFoundException e) {
		throw new Exception("File not found");
	}
	
	finally {
	

	System.out.println("i will get printed");
	}
	}
}
