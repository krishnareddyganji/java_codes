 class load{
public void overload(int a,int b){
System.out.println("the sum of  "+(a+b));
}
public void overload(int a,int b,int c){
System.out.println("the sum of "+(a+b+c));
}

}

class ride1{
public void override(){
System.out.println("hello");

}
}
class ride2{
public void override()
{
System.out.println("java ");
}
}


class overloadride{
public static void main(String [] args){
load o=new load();
o.overload(2,3);
o.overload(4,6,8);
ride1 r1=new ride1();
ride2 r2=new ride2();
r1.override();
r2.override();


}
}

