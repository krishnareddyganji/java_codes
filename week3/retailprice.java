/*A mail-order house sells five products whose retail prices are as follows : Product
1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold.*/

import java.util.*;

class retailprice{

   double product1=99.00;
   double product2=20.20;;
   double product3=6.87;
   double product4=45.50;
   double product5=40.49;
   
   public static void main(String [] args){
   
   	//creating object by using retailprice class;
   	retailprice s=new retailprice();
   	Scanner input =new Scanner(System.in);
   	while(true){
   	System.out.println("-----THE MENU IS -----");
   	System.out.println("product 1 = 99.00 ");
   	System.out.println("product 2 = 20.20 ");
   	System.out.println("product 3 = 6.87  ");
   	System.out.println("product 4 = 45.50 ");
   	System.out.println("product 5 = 40.49 ");
   	
   	
   	System.out.print("enter product number ::");
   	int productnumber=input.nextInt();
   	
   	System.out.print("enter the quantity of the product");
   	int productquantity=input.nextInt();
   	
   	
   	//using switch case 
   	
   	switch(productnumber){
   	case 1:
   	double retail_price0 = (productquantity*99.00);
   	System.out.println(retail_price0);
   	break;
   	
   	case 2:
   	double retail_price1 = productquantity*20.20;
   	System.out.println(retail_price1);
   	break;
   	
   	case 3:
   	double retail_price2 = productquantity*6.87;
   	System.out.println(retail_price2);
   	break;
   	q
   	case 4:
   	double retail_price3 = productquantity*45.50;
   	System.out.println(retail_price3);
   	break;
   	
   	case 5:
   	double retail_price4 = productquantity*40.49;
   	System.out.println(retail_price4);
   	break;
   	
   	default: break;
   	
   	
   	}
   	}
   	}
   	}
   	
