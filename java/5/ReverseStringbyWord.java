import java.util.Scanner;
public class ReverseStringbyWord {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(reverse(text));
        sc.close();
    }
    static String reverse(String txt)
    {
        String z = "";
        String[] word = txt.split(" ");
        int len = word.length;
        System.out.println("Orignal Text:"+txt);
        System.out.println("Reverse Text:");
        for(int i=len-1;i>-1;i--)
        {
            String x = word[i];
            z = z +" "+ x;
        }
        return z;
    }
}
