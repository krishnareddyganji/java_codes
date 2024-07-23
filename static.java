class studentt{

	int roll;
	String name;
	static String collage="rgukt";
	
	studentt(int r,String n){
	roll=r;
	name=n;
	}
	studentt(){
	System.out.println(collage);
	}
	
	void display(){
	System.out.println(roll+" "+name+" "+collage);
	}
	static void change(){
	collage="zphs";
	}
	
	public static void main(String [] args){
	studentt s1=new studentt (1,"krishna");
	studentt s2=new studentt (2,"vardhan");
	studentt s3=new studentt();
        s3.change();
	s1.display();
	s2.display();
        s3.display();
	}
	}
