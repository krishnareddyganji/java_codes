import java.util.*;
public class linearsearch{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		//for enter the array size;
		System.out.println("enter the size of  the array ");
		int n=sc.nextInt();
		int []a=new int[10];
		System.out.println("enter the elements into the array ");
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		
		System.out.println("the entered array is ::");
		for(int i=0;i<n;i++){
		System.out.println(" "+a[i]);
		}
		
		// for linear search we can get an key word 
		System.out.print("enter the key to search inn the array::  ");
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		if(a[i]==key){
		System.out.println("yes, key is presentv at location :: "+a[i]);
		}
		}
		}
		}
	
		
