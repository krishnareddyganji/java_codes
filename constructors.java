 class constructors{
 		int id;
 		String name;
 		static String collage="rgukt";
 		String sex;
 		
 		constructors(int id,String name){
 		this.id=id;
 		this.name=name;
 		
		}
		constructors(String name,int id,String sex  ){
		this.name=name;
		this.id=id;
		this.sex=sex;
		}
		
  public static void main(String [] arg){
  constructors s1=new constructors(27,"krishna");
   constructors s2=new constructors("vishnu",26,"female");
  
  s1.display();
  s2.display();
  
  }
		void display(){
		System.out.println(id+"  "+name+" "+collage+" "+sex);
		
		}
  }
  
  
  
