import java.util.Scanner;
public class ReverseString{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        reverse(text);
        sc.close();
    }
    static void reverse(String txt){
        int len = txt.length();
        System.out.println("Orignal Text:"+txt);
        System.out.println("Reverse Text:");
        for(int i=len-1;i>-1;i--)
        {
            char x = txt.charAt(i);
            System.out.print(x);}}
}