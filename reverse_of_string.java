import java.io.*;
import java.util.Scanner;

public class reverse_of_string 
{
	public static void main(String[] args) 
	{

        String nstr = "";
        char ch;
        
        Scanner stringScanner = new Scanner(System.in);
        System.out.print("Enter the string to be reversed : ");
        
        String str = stringScanner.next();
       
        System.out.print("\nOriginal String : " + str);
       
        for (int i=0 ; i<str.length() ; i++)
        {
            ch = str.charAt(i); 
            nstr = ch + nstr; 
        }   
        
        System.out.println("\nReversed String : " + nstr);
    }
}
