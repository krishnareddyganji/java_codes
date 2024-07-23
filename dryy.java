import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dryy implements ActionListener{
public Label l1,l2;
public JCheckBox c1,c2;

	dryy(){
	JFrame f=new JFrame("new frame ");
	f.setSize(600,600);
	f.setVisible(true);
	f.setLayout(null);
	
	l1=new Label("welcome you selected option 1");
	l1.setBounds(200,400,500,50);
	l1.setVisible(false);
	
	l2=new Label("welcome you selected option 2");
	l2.setBounds(200,400,500,50);
	l2.setVisible(false);
	
	c1=new JCheckBox("option 1");
	c1.setBounds(300,300,70,30);
	c1.setBackground(Color.pink);
	
	c2=new JCheckBox("option 2");
	c2.setBounds(400,300,100,30);
	
	JComboBox c3=new JComboBox();
	c3.setBounds(500,300,100,50);
	c3.add("hello");
	c3.add("java");
	c3.add("welcome");
	
	f.add(l1);
	f.add(l2);
	f.add(c1);
	f.add(c2);
	f.add(c3);
	c1.addActionListener(this);
	c2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==c1){
	l1.setVisible(true);
	l2.setVisible(false);
	}
	if(e.getSource()==c2){
	l2.setVisible(true);
	l1.setVisible(false);
	}
	
	}

public static void main (String []args){
 new dryy();
}}

