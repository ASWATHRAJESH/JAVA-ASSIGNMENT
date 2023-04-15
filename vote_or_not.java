import java.util.Scanner;

class vote_or_not
{
    public static void main(String args[])
    {
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age : ");
        n = s.nextInt();
        
        if(n >= 18)
        {
            System.out.println("Entered user's age (" + n + ") is eligible to vote in national election"); 
        }
        else
        {
            System.out.println("Entered user's age (" + n + ") is not eligible to vote in national election"); 
        }   
    }
}