/*6. Write an application that finds the length of a given string.*/

import java.util.*;
class stringlength{
        int length(String s){
        int k=s.length();
        return k;
        
        }
	public static void main(String [] ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		stringlength obj=new stringlength();
		int l=obj.length(s);
		System.out.println(l);
		}
	}
	
