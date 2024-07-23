import java.sql.*;
public class Retriving {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sys","root","root");
System.out.println("database connected");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("show tables");
while(rs.next()) {
System.out.println(rs.getString(1));
}
con.close();
}catch(Exception e)
{
System.out.println("not connected");

}
}
}
