import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.equals(reverse(text))){System.out.println("It is a Palindrome.");}
        else{System.out.println("It is not a Palindrome.");}
        sc.close();
    }
    static String reverse(String txt){
        int len = txt.length();
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