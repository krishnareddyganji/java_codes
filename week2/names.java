import java.util.*;

class names{

public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	System.out.print("no.of names==  ");
	int n=sc.nextInt();
	int i,j;
	String array[]=new String[n];
	System.out.println("enter the"+ n +" names");
	
	for(i=0;i<n;i++){
		array[i]=sc.nextLine();
		}
	
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(array[i]. compareTo (array[j])<0){
				String t=array[i];
				array[i]=array[j];
				array[j]=t;
				}
				}
				}
	
		for(i=0;i<n;i++){
			System.out.println(array[i]);
		}
		}
		}
	
