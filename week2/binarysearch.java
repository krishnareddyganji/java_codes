import java.util.*;
 
 public class binarysearch{
 	public static void main(String... args){
 	
 	Scanner sc=new Scanner(System.in);
 	System.out.println("enter the size of the array ");
 	int n=sc.nextInt();
 	int []a= new int[10];
 	System.out.println("enter the elements in the  array ");
 	for(int i=0;i<n;i++){
 		a[i]=sc.nextInt();
 		}
 		// for shoting an array;
 		for(int i=0;i<n;i++){
 			for(int j=i+1;j<n;j++){
 				
 				if(a[i]>a[j]){
 				int t=a[i];
 				a[i]=a[j];
 				a[j]=t;
 				}
 				}
 				}
 				System.out.println("after sorting ::: ");
 				for(int k=0;k<n;k++)
 				{
 				System.out.println(a[k]);
 				}
 					
 	System.out.println("enter the key ");
 	int key=sc.nextInt();
 	int mid,f=0,l=n-1;
 	while(f<=l){
 		mid=(f+l)/2;
 			if(key==a[mid]){
 			System.out.println("key is found at index "+mid);
 			break;
 			}
 			else if(key>a[mid]){
 				f = mid+1;
 			}
 			else{
 				l = mid-1;
 			}
 		}
 		}
 		}
 		
 	
 	
 		
