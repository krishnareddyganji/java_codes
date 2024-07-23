import javax.swing.*;
public class studentform{

	public static void main (String [] args){
	
	JFrame f=new JFrame("student form");
	f.setSize(600,600);
	f.setVisible(true);
	f.setLayout(null);
	
	JTextField t1,t2;
	
	JLabel l1=new JLabel("name :");
	l1.setBounds(50,40,100,40);
	t1=new JTextField();
	t1.setBounds(120,50,110,20);
	f.add(l1);
	f.add(t1);
	
	JLabel l2=new JLabel("age   :");
	l2.setBounds(50,80,60,40);
	t2=new JTextField();
	t2.setBounds(120,95,110,20);
	f.add(l2);
	f.add(t2);
	
	JLabel l3=new JLabel("id  :");
	l3.setBounds(50,160,110,20);
	JTextField t3=new JTextField();
	t3.setBounds(120,160,110,20);
	f.add(t3);
	f.add(l3);
	
	
	JLabel l4=new JLabel(" department : ");
	l4.setBounds(50,220,300,50);
	
        String dept[]={"CSE","ECE","CE","EEE","ME","MME","CHE"};
 	JComboBox c=new JComboBox(dept);
	c.setBounds(50,260,60,40);
	f.add(l4);
	f.add(c);
	
	
	
	
	
	
	}
	}
