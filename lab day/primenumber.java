import java.util.Scanner;  
class primenumber
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);         
        System.out.print("Enter first number: ");  
        int x=sc.nextInt(); 
        System.out.print("Enter second number: ");  
        int y=sc.nextInt();
        sc.close();
        range(x,y);
    }
    static void range(int a, int b)
    {
        for (;a<b;a++)
        {
            prime(a);
        }
    }
    static void prime(int z)
    {
        int n=0;
        for (int i = 2; i <= z / 2; i++) 
        {
            if (z % i == 0) {
              n=1;}
        }
        if(n==0){System.out.println(z+" is a prime number");}
    }
}
