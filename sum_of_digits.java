import java.util.Scanner;

class sum_of_digits
{
    public static void main(String args[])
    {
        int n , ori , rem , sum = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = s.nextInt();
        
        ori = n;
        
        while(n > 0)
        {
          rem = n % 10;
    	    sum = sum + rem;
    	    n /= 10;
        }
         
        System.out.println("Sum of the digits of the number " + ori + " : " + sum);     
    }
}
 