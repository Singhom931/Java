import java.util.Scanner;

public class fact
{	
	public static void main(String[] args)
	{	
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 0;
        input.close();

        for (int i= 0; number > 0; number--) {
            factorial = factorial + number;
        }
        System.out.println(factorial);
	}
}