import java.util.Scanner;

public class sum_of_two_numbers
{
  static int sum(int x,int y) 
  {
      return x+y;
  }

  public static void main(String[] args) 
  {
      int n1,n2,z;
        
      Scanner s = new Scanner(System.in);
      System.out.print("Enter n1 : ");
      n1 = s.nextInt();
      System.out.print("Enter n2 : ");
      n2 = s.nextInt();

      z = sum(n1,n2);

      System.out.print("Sum of " + n1 + " and " + n2 + " : " + z);
  }
}