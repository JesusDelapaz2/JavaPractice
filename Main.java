public class Main
{
    public static int iterativeFactorial(int n)
    {
        int result = 1;

        while (n > 0)
        {
            result *= n;
            n -= 1;
        }

        return result;
    }
    public static void main(String[] args)
    {
        int fourFactorial = iterativeFactorial(19);

        System.out.print(fourFactorial);
    }
}