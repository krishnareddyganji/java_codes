/*4.Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
by 10000 ms ] and count number Successful attempts.
successful attempt : If the pair of Dice results in same values.*/

import java.util.*;
import java.lang.Thread;
class rollingdices{

 public static void main(String [] args){
 int dice1,dice2,count=0;
 	for(int i=0;i<10;i++){
 		dice1=new Random().nextInt(6);
 		dice2=new Random().nextInt(6);
 		if(dice1==dice2){
 		count++;
 		}
 		try{
 		Thread.sleep(2000);
 		System.out.println(i+"  dice1"+"="+dice1+ "  "+ i+"  dice2"+"=" +dice2);
 		
 		}
 		catch(Exception e){
 		System.out.println(e);
 		}
 		}
 		System.out.println(count);
 }
 }
