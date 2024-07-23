import java.util.*;
class arrey{
public static void main(String[] a)
{
	Scanner c=new Scanner(System.in);
	int[] r=new int[5];
	int i,e=0,d=0;
	for(i=0;i<5;i++)
	{
		r[i]=c.nextInt();
	}
	for(i=0;i<5;i++)
	{
		if(r[i]==0)
		d++;
		else
		e++;
	}
	System.out.println("zeros r==  "+d+"\n"+"  ones r== "+e);
	
}
}
