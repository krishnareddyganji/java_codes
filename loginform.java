import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	public class loginform {	
	public TextField t1,t2;
	public Label l4,l1,l2,l3;
	public Button b1,b2,b3;
	public Checkbox c;
	
	loginform(){
	
	Frame f=new Frame();
	
	f.setSize(700,700);
	f.setLayout(null);
	f.setVisible(true);
	f.setBackground(Color.yellow);
	
	Label l1=new Label("USERNAME ::");
	l1.setBounds(200,200,80,30);
	l1.setBackground(Color.pink);
	
	Label l2=new Label("PASWORD  ::");
	l2.setBounds(200,300,80,30);
	l2.setBackground(Color.pink);
	
	
	TextField t1=new TextField();
	t1.setBounds(300,205,100,20);
	
	TextField t2=new TextField();
	t2.setBounds(300,305,100,20);
	
	Button b1=new Button("");
	b1.setBounds(300,350,20,20);
	b1.setBackground(Color.green);
	
	Label l3=new Label("show password");
	l3.setBounds(330,345,100,30);
	l3.setBackground(Color.pink);
	
	Checkbox c = new Checkbox("C++");    
        c.setBounds(500,500,50, 50);
	
	
	Button b2=new Button("LOGIN");
	b2.setBounds(300,400,60,50);
	b2.setBackground(Color.green);
	
	Button b3=new Button("RESET");
	b3.setBounds(400,400,60,50);
	b3.setBackground(Color.green);
	
	Label l4=new Label("WELCOME TO RGUKT");
	l4.setBounds(300,110,150,30);
	l4.setVisible(false);
	l4.setBackground(Color.white);
	
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			l4.setVisible(true);
		}
	});
	b3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	b2.setBackground(Color.white);
	}
	});
	
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(t1);
	f.add(t2);
	f.add(c);
	
	
	}
	
	
	
	
	
	public static void main (String [] rags){
	new loginform();
	}
	}

	
