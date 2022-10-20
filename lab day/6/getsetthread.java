public class getsetthread extends Thread  
{      
    public void execute()  
    {    
        System.out.println("this thread is working");    
    } 
    public static void main(String args[])  
    {    
        getsetthread t1=new getsetthread();    
        getsetthread t2=new getsetthread();     
        t1.start();    
        t2.start();       
        t1.setName("Threadone");    
        t2.setName("Threadtwo");  
        System.out.println("Thread 1: "+t1.getName());  
        System.out.println("Thread 2: "+t2.getName());  
    }    
}  