/*5. Write a Java program to print all vowels in given string and count number of vowels and
consonants present in given string*/

import java .util.*;
class vowels{
	public static void main(String [] ar){
		int c1=0,c2=0;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		int l=s.length();
		for(int i=0;i<l;i++){
			char c=s.charAt(i);
			if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'){
				c1++;
				System.out.println(c1+":"+c);
			}
				else
				c2++;
			}
			System.out.println("the number of vowels are  "+c1);
			System.out.println("the number of comsonants are "+c2);
		}
		}
		

