import java.lang.Math;
import java.util.Scanner;

class Armstrong_or_not 
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
    	    sum += Math.pow(rem , 3);
    	    n /= 10;
        }
        
        if(sum == ori) 
	  {
          System.out.println(ori + " is an Armstrong number");    
        }
        else 
	  {
          System.out.println(ori + " is not an Armstrong number");     
        }    
    }
}
 