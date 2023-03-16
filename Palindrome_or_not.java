import java.util.Scanner;

class Palindrome_or_not
{
    public static void main(String args[])
    {
        int n , ori , rem , rev = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = s.nextInt();
        
        ori = n;
        
        while(n>0)
        {
          rem = n % 10;
    	    rev = rev*10 + rem;
    	    n /= 10;
        }
        
        if(rev == ori) 
	  {
          System.out.println(ori + " is a palindrome");    
        }
        else 
	  {
          System.out.println(ori + " is not a palindrome");     
        }
    }
}
 