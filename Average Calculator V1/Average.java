public class Average
{
    private int one,two,average; 

    public void setNums(int num1, int num2)
    {
        one = num1;
        two = num2;
    }

    public void average ()
    {
        int sum = 0;
        sum = one + two;
        average = sum / 2;
    }

    public void print ()
    {
        System.out.print("The average is " + average + " ");
    }

}