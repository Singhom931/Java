package computer;

import java.util.Scanner;

public class array {
    Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        array arr = new array();
        int x = length();
        char[] text= new char[x];
        for (int i=0;i<x;i++){
            text[i]= letter();}
        for (char z:text){System.out.print(z);}
    }
    static int length(){
        System.out.println("Enter Number of Char:");
        array arr = new array();
        int x = arr.sc.nextInt();
        return x;
    }
    static char letter(){
        array arr = new array();
        char a = arr.sc.next().charAt(0);
        return a;
    }
}
