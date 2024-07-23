/* 3.Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value*/
import java.util.*;
class members{
 public static void main(String [] args){
 
 	Scanner sc=new Scanner(System.in);
 	int a[]=new int[5];
 	int i=0,n,k;
 	System.out.println("enter  numbers  10 to 100 :: ");
	while(i<5){
	    boolean bool=true;
		System.out.print("enter a numbers :: ");
		n=sc.nextInt();
		if(n>=10 && n<=100){
			
			for(int j=0;j<i;j++){
					if(a[j]==n){
					System.out.println ("dublicate  ");
					bool=false;
					break;
					}
		            }
		            
		            if(bool){
					a[i++]=n;
			 		}
			 }
		else{
			System.out.println(n+" is out of range  ");
			}
			}
			
	for(k=0;k<5;k++){
		System.out.println(a[k]);
	}
}
}

 

