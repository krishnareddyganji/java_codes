import java.util.*;

class matrix{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
	
		System.out.println("enter the row size of matrix 1 ");
		int r1= input.nextInt();
		System.out.println("enter the col size of matrix 1");
		int c1=input.nextInt();
		int a[][]=new int[r1][c1];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=input.nextInt();
			}
			}
		
		System.out.println("enter the row size of matrix 2 ");
		int r2= input.nextInt();
		System.out.println("enter the col size of matrix 2");
		int c2=input.nextInt();

		int b[][] =new int[r2][c2];
			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
				b[i][j]=input.nextInt();
					}
				}
				int c[][]=new int[c1][r2];
				System.out.println("entered matrix 1 is  ::");
				for(int i=0;i<r1;i++){
					for(int j=0;j<c1;j++){
						System.out.println(a[i][j]);
					}
					}
	System.out.println("entered matrix 2 is  ::");		
    for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
                System.out.println(b[i][j]);
			}
			}
			
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
				c[i][j]=(a[i][j]+b[i][j]);
 			}
 			}
 			
		System.out.println("resultant matrix is---");
			 for(int i=0;i<c1;i++){
				for(int j=0;j<c2;j++){
               			 System.out.print(c[i][j]);
			}
			System.out.println(" ");
			}
			}
			}


					
					
		
		
		
		
		
		
