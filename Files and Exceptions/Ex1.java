import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ex1 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        try
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
            
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e1)
        {
            System.out.println(e1.getClass().getName()+": / by zero");
            
        }
        sc.close();
    }
}

