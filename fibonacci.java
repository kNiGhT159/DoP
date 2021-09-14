public class fibonacci 
{
    public static void main(String args[]) 
    {
        int num, a = 0, b = 0, c = 1;
        num = Integer.parseInt(args[0]);
        
        System.out.print("Fibonacci Series : ");
        
        for(int i = 1; i <= num; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}