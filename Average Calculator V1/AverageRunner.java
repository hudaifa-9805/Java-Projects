import java.util.Scanner;
public class AverageRunner 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Average test = new Average();

        System.out.println("Enter your first number :: ");
        int num1 = keyboard.nextInt();

        System.out.println("Enter your second number :: ");
        int num2 = keyboard.nextInt();

        test.setNums(num1, num2);
        test.average();
        test.print();



    }
}
