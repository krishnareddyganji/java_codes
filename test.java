import java.util.*;
class dupli{
	public static void main(String [] args){
	int a[]=new int[5];
	int k=0;
	Scanner sc=new Scanner(System.in);
	for(int i=0;k<5;i++){
	int x=sc.nextInt();
	if(x>=10 && x<=100)
	{
	for(int j=0;j<k;j++){
	if(x==a[j]){
	System.out.println("dupli");
	}
	else{
	a[k++]=x;
	}
	
	}
	}
	else
	{
	System.out.println("out of bound");
	}
	
	
	}
	}
	}
	
    
    
 
