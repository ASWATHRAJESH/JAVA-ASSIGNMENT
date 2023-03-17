import java.util.Scanner;

class Primenumber_or_not
{
    public static void main(String args[])
    {
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number upto which prime numbers to be found out : ");
        n = s.nextInt();
        
        System.out.println("Prime numbers from 1 to " + n + " : ");
        
        for(int i = 1 ; i <= n ; i++)
	  {
            if(i == 1)
            {
                continue;
            }
            else
            {
                for(int j = 1 ; j <= i/2 ; j++)
                {
                    if(i % j == 0) 
		        {
                        break;
                    }
                }

                System.out.print(i + " ");
            }
        }
    }
}


 