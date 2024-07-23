import java.util.*;
class stringg{
public static void main(String [] s){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
        String str=sc.nextLine();
       for(int i=0;i<str.length();i++){
       char c=str.charAt(i);
        System.out.println(str.lastIndexOf(c));
        }
        }
        }
