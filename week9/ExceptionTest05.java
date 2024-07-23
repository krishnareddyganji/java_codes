    public class ExceptionTest05 {  
      
        private static final String ab = "123.33";   
          
        public static void main(String[] args) {  
            try {  
                     int a = Integer.parseInt(ab);  
            }
            
            catch(NumberFormatException ex){  
                System.err.println("Invalid string in argumment");  
                	
            }  
                }  
    }  
