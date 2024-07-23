
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calsi implements ActionListener{

public TextField t1,t2,t3;
public JLabel l,l1,l2,l3;
public JButton b1,b2,b3,b4;	
   calsi(){	
	JFrame f=new JFrame("calculator");
	f.setSize(400,400);
	f.setVisible(true);
	f.setLayout(null);
	
	l=new JLabel("enter first number ");
	l.setBounds(200,80,200,80);
	
	 t1=new TextField();
	t1.setBounds(200,150,50,20);
	
	 l1=new JLabel("enter second number ");
	l1.setBounds(400,80,200,80);
	
	t2=new TextField();
	t2.setBounds(400,150,50,30);
	
	 l2=new JLabel("result");
	l2.setBounds(300,300,70,20);
	
	t3=new TextField();
	t3.setBounds(300,350,70,30);
	t3.setEditable(false);
	t3.setVisible(true);
	
	
	b1 =new JButton("+");
	b1.setBounds(100,500,50,50);
	
	 b2 =new JButton("-");
	b2.setBounds(200,500,50,50);
	
	b3 =new JButton("*");
	b3.setBounds(300,500,50,50);
	
	b4 =new JButton("/");
	b4.setBounds(400,500,50,50);
	
	l3=new JLabel("operation done");
	l3.setBounds(300,600,150,150);
	l3.setVisible(false);
	
	
	
	f.add(t1);
	f.add(l);
	f.add(l1);
	f.add(t2);
	f.add(l2);
	f.add(t3);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(l3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	
	
	}
	

	
	public void actionPerformed(ActionEvent e)
{

	int n1=Integer.parseInt(t1.getText());
	int n2=Integer.parseInt(t2.getText());

	if(e.getSource()==b1){
		t3.setText(String.valueOf(n1+n2));
		l3.setVisible(true);
	}

	if(e.getSource()==b2){
		t3.setText(String.valueOf(n1-n2));
	}
	
	if(e.getSource()==b3){
		t3.setText(String.valueOf(n1*n2));
	}
	if(e.getSource()==b4){
		t3.setText(String.valueOf(n1/n2));	
	}

}
public static void main (String [] args){
 new calsi();
}
}





