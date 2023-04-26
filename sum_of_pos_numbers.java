import java.util.Scanner;

class sum_of_pos_numbers
{
    public static void main(String args[])
    {
        int n , sum = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter series of numbers : ");

        while(i>0)
        {
            n = s.nextInt();
            
            if(n>0)
            {
                sum = sum + n;
            }
            else
            {
                break;
            }
            
            i = i+1
        }
         
        System.out.println("Sum of positive numbers entered in the series : " + sum);     
    }
}
