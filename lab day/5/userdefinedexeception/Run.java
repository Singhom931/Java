package userdefinedexeception;

public class Run{
    public static void main(String args[])
    {
        
        try {
            throw new DException("this is an exception");
        }
        catch (DException d) {
            System.out.println("Occured");
            System.out.println(d.getMessage());
        }
    }
}