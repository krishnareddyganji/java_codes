import java.io.*;
import java.net.*;
import java.util.Scanner;
public class dry{
    public static void main(String [] args){
        try{
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("server is waiting");
        Socket s= ss.accept();
        System.out.println("cliend connect ");

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the command to run ");
        String command = sc.nextLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println(command);
        System.out.println("command sent to client" + command);
        s.close();



    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}