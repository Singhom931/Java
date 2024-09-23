import java.util.Scanner;  
class perfectnumber
{
public static void main(String args[]) 
{

    int z=0;
    Scanner sc=new Scanner(System.in);         
    System.out.print("Enter first number: ");  
    int x=sc.nextInt(); 
    z = x; 
    System.out.print("Enter second number: ");  
    int y=sc.nextInt();  
    perfect(x,y);
    System.out.print(" numbers between "+z+" and "+y);
    sc.close();
}

static void perfect(int a,int b)
{
    int k=0,c=0,i=1;
for (;a<b;a++){
    for (i=1;i<=(a+2)/2;i++){
        if (a%i==0){
            k = k + i;}
        }
        if (k==a){
            //System.out.println("found");
            c++;}
    //System.out.println(k+"k");
    k = 0;
}
    //System.out.println(c+"c");
    System.out.print("There are "+c);

}
}