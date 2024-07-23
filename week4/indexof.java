   /*3. Write an application that uses String method indexOf to determine the total
number of occurrences of any given alphabet in a defined text.*/

import java.util.*;
class indexof{
	public static void main(String[] args){
		int count=0;
		System.out.println("enter the string  ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter the charecter ");
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length()-1;i++){
		if(s.charAt(s.indexOf(c))==s.charAt(i)){
		count++;
		}
		}
		System.out.println(count);
		
		
		
			}
			}
			
			
