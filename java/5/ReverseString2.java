import java.util.Scanner;
public class ReverseString2{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(reverse(text));
        sc.close();
    }
    static String reverse(String txt){
        int len = txt.length();
        System.out.println("Orignal Text:"+txt);
        System.out.println("Reverse Text:");
        char list[] = new char[len];
        int z =0;
        for(int i=len-1;i>-1;i--)
        {
            char x = txt.charAt(i);
            list[z]=x;z++;
        }
        String reversetxt = String.valueOf(list);
        return reversetxt;
        }
}