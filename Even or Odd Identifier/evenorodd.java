import java.util.Scanner;
public class evenorodd
{
    public static void main (String[] args)
    {
        Scanner EvenOrOdd = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = EvenOrOdd.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("This number is even");
        }
        else 
        {
            System.out.println("This number is odd");
        }
            
    }
}