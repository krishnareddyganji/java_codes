import java.util.*;

/*class dublicate{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n+1];
	int k=0;
	
	System.out.println("enter the elements ");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n+1;j++){
			if(a[i]!=a[j]){
				b[k]=a[j];
				k++;
				}
				}
				}
	System.out.print("the repeted elements are :: ");
	for(int i=0;i<k;i++){
	System.out.print(b[i]+" ");
	}
	}
	}
	
	3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value
*/

class duplicate{
	public static void main(String [] args){
	int b[]=new int[5];
	int c[]=new int[5];
	int l=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 5  elements ");
	int k=0;
	for(int i=0;k<5;i++){
	int a=sc.nextInt();
	if(a>10 && a<=100){
	b[k]=a;
	k++;
	}
	else{
	System.out.println("eneter the number which is  between 10 and 100 inclusive");
	}
	}
	
	for(int i=0;i<5;i++){
	int m=0;
		for(int j=0;j<5;j++){
		if(i==j){
		continue;
		}
		if(b[i]==b[j]){
		m++;
		}
		}
		if(m==0){
		c[l]=b[i];
		b[i]=0;
		l++;
		}
		}
		System.out.println("the unique elements are ::  ");
		for(int i=0;i<l;i++){
		
	        System.out.println ("  "+c[i]);
	}
	}
	}
	
	

			
	
