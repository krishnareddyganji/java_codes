package week;
import java.util.*;
	class primefactor{
		public static void main(String[] ar){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  any value ");
			int a=sc.nextInt();
			for(int i=2;i<a;i++)
			{
				while(a%i==0){
					System.out.println(i+" ");
					a=a/i;
					}
					}
					if(a>2){
						System.out.println(a+" ");
						}
				}
				}
