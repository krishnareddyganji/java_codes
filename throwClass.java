public class throwClass{
public static void main(String [] args ){
try{
int c=0;
throw new NullPointerException ("hello");
}
catch(NullPointerException e){
System.out.println("world");
}
finally{
System.out.println("code executed");
}


}
}

	
