import java.util.Scanner;  
class sumofdigit
{  
public static void main(String args[])  
{  
int number,i;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter any number: ");   
number=sc.nextInt();  
i=number;
numbers(number,i);
sc.close();
} 

static void numbers(int j,int k){
int a=0;
while(j>0){
    a=a+j% 10;
    j=j/10;
    //System.out.println(j);
}
System.out.println(a);
}
}  