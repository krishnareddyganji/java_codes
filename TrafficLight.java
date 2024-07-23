class signal{
	public void run(){
	
	while(true){
	try{
	System.out.println("red ON ");
	Thread.sleep(1000)
	System.out.println("red OFF");
	System.out.println("yellow ON");
	Thread.sleep(1000)
	System.out.println("yellow OFF");
	System.out.println("green On");
	Thread.sleep(1000)
	System.out.println("green OFF");
	}
	catch(Exception e){}
	}
	}
	
	public class TrafficLight{
		public static void main(String [] args){
		signal s=new signal();
		s.start();
		}
		}
