public class ExceptionTest04
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            System.out.println(e);
                    }
    }
}

