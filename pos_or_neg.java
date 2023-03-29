import java.util.Scanner;

class pos_or_neg
{
    public static void main(String args[])
    {
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = s.nextInt();
        
        if(n > 0)
        {
            System.out.println("The number " + n + " is positive"); 
        }
        else
        {
            System.out.println("The number " + n + " is negative");
        }   
    }
}