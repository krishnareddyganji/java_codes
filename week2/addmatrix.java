import java.util.*;

public class addmatrix{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the row size of matrix 1 ");
		int r1= input.nextInt();
		System.out.println("enter the col size of matrix 1");
		int c1=input.nextInt();
		int a[][]=new int[r1][c1];
			
		System.out.println("enter the elements of matrix 1");

		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=input.nextInt();
			}
			}
		
		System.out.println("enter the row size of matrix 2 ");
		int r2= input.nextInt();
		System.out.println("enter the col size of matrix 2");
		int c2=input.nextInt();
		System.out.println("enter the elements of matrix 2");

		int b[][] =new int[r2][c2];
			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
				b[i][j]=input.nextInt();
					}
				}
			System.out.println("entered matrix 1 is  ::");
		        for(int i=0;i<r1;i++){
					for(int j=0;j<c1;j++){
						System.out.print(a[i][j]+" ");
					}
						System.out.println("  ");
					}
    		System.out.println("entered matrix 1 is  ::");
                 for(int i=0;i<r2;i++){
						for(int j=0;j<c2;j++){
            	    System.out.print(b[i][j]+"  ");
					}
						System.out.println("  ");
	
					}
				int c[][]=new int[r1][c2];
					for(int i=0;i<c1;i++){
						for(int j=0;j<r2;j++){
            			     c[i][j]=a[i][j]+b[i][j];
							}
							} 
				System.out.println("the sum of the two matrix is::");
                 for(int i=0;i<r2;i++){
			       for(int j=0;j<c2;j++){
                	System.out.print(c[i][j]+"  ");
					}	
						System.out.println("  ");

					}

					
 			}
			}


					
					
		
		
		
		
		
		
