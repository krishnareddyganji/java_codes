import java.util.*;

	class sort{
		public static void main(String[] args){
			Scanner sc =new Scanner (System.in);
			int []a=new int[]{1,4,2,8,6,0,6};
				int j,i,k;
				i=0;
				for(i=0;i<a.length;i++){
					j=i+1;
					while(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
					}
					System.out.println("after sorting array ::");
		for(k=0;k<a.length;k++){
					System.out.println(a[k]);
					}
			}
			}	
							
			
