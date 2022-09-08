import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        number(num);
        sc.close();
    }

    static void number(int a){
        int e = 1;
        for(int i=2;i<=a/2;i++)
       {
           if((a%i)==0){
            e = 0;
           }
       }
        if(e < 1){System.out.println(a+" is not prime");}
        else if(e > 0){System.out.println(a+" is prime");}
    } 
}