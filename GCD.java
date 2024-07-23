import java.util.*;

 public class GCD{
 int count;
 
 public int gcd(int a,int b){
 if(a<b){
 
 for(int i=0;i<=a;i++){
 if(i%a==0 && i%b==0){
	count=i;
 
 }
 }
 }
 
 else{
 for(int j=1;j<b;j++){
 if(j%a==0 && j%b==0){
	count=j;
 
 }
 }
 }
 return count;
 }
 public static void main(String [] args){
        Scanner s=new Scanner(System.in);
 	System.out.println("enter the numbers");
 	int a=s.nextInt();
 	int b=s.nextInt();
        GCD g=new GCD();
        int k=g.gcd(a,b);
        System.out.println(k);
        }
        }
        	
