public class ThrowThrows  
{  
    static void zero() throws ArithmeticException  
    {   
        throw new ArithmeticException("throw ArithmeticException");  
    }  
    public static void main(String args[])  
    {  
        try  
        {  
            zero();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
    }  
}  