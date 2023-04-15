import java.lang.Math;
import java.util.Scanner;

class Multiplication_table 
{
    public static void main(String args[])
    {
        int n , x ;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        n = s.nextInt();

        System.out.print("Enter a number upto which multiplication table is to be printed : ");
        x = s.nextInt();
        
        System.out.println("\nMultiplication table of " + n + " : ");
        
        for(int i=0 ; i<=x ; i++)
        {
            System.out.println(n + "*" + i + " = " + n*i);
        } 
    }
}