import java.util.*;

class rectangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int l=sc.nextInt();
                System.out.println("enter the breath of the rectangnle ");
		int b=sc.nextInt();
		rect a=new rect();
		a.get_area(l,b);
		a.get_perimeter(l,b);
		
		}
		}
		
		class rect{
			void get_area(int l,int b){
			int area=l*b;
			System.out.println(area);
			}
			void get_perimeter(int l,int b){
			int perimeter=2*l*b;
			System.out.println(perimeter);
			}
			}
			
