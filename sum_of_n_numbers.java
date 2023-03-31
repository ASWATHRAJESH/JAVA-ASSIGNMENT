import java.util.Scanner;

public class sum_of_n_numbers
{
  static int sum(int n) 
  {
      int sum = 0;
      for(int i=1; i<=n; i++)
      {
          sum = sum + i;
      }
      return sum;
  }

  public static void main(String[] args) 
  {
      int n,z;
        
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the value of n : ");
      n = s.nextInt();

      z = sum(n);

      System.out.print("Sum of all integers from 1 to " + n + " : " + z);
  }
}