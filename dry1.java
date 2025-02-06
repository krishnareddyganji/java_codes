import java.io.*;
import java.net.*;

public class dry1 {
    public static void main(String [] args)
    { try{
        Socket s = new Socket("localhost",3000);
        System.out.println("connected to the server ");
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        

    }catch(IOException e){
        e.printStackTrace();
    }
}
    
}
