//Write a small application with a default date 01/01/2000 and three combo boxes
//displaying valid days, months & year (1990 – 2050). Change the displayed date with the
//one chosen by user from these combo boxe
import java.awt.*;


public class First {
    public static void main(String[] args) {
     Label dateLabel;
        Frame frame = new Frame("AWT Button Example");
	Button button = new Button("SUBMIT");
	button.setBounds(200,400 , 80, 30);
	frame.add(button);
	frame.setSize(500, 500);
	frame.setLayout(null);
	frame.setVisible(true);
	
	   dateLabel = new Label("Selected Date: 01/01/2000");
        frame.add(dateLabel);
        frame.setSize(300, 150);
        frame.setVisible(true);
       
	
	
	frame.setTitle("days");
	
	Choice c1 = new Choice();
	for (int i=1;i<=12;i++){
	c1.add(String.valueOf(i));
	}
	frame.add(c1);
	c1.setBounds(100,100,80,30);
	
	
	Choice c2=new Choice();
	for(int i=1;i<=31;i++){
	c2.add(String.valueOf(i));
	}
	frame.add(c2);
	c2.setBounds(200,100,80,30);
	
	
	Choice c3=new Choice();
	for(int i=1990;i<=2050;i++){
	c3.add(String.valueOf(i));
	}
	frame.add(c3);
	c3.setBounds(300,100,80,30);
	
	
    }
}



