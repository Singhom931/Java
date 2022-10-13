public class NestedTryBlock{ 
    static String B(String b){return b;}   
    public static void main(String args[]){   
     try{   
        String b = new String();
        B(b);  
       try{    
       int a[]=new int[5];     
       a[5]=4;    
    }  
       catch(ArrayIndexOutOfBoundsException e)  
       {  
          System.out.println(e);  
       }       
     }  
     catch(NullPointerException e)  
     {  
       System.out.println(e);  
     }    
       
     System.out.println("normal flow..");    
    }    
   }  