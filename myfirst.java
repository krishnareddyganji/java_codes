//Write a small application with a default date 01/01/2000 and three combo boxes
//displaying valid days, months & year (1990 – 2050). Change the displayed date with the
//one chosen by user from these combo boxe


import java.awt.*;  
class First extends Frame{  
First(){  
Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame  
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){  
First f=new First();  
}}  
