import java.util.*;
class Neg1 extends Exception
{
    public String toString()
    {
        return "java.lang.Exception: n and p should not be zero.";
    }
}
class Neg2 extends Exception
{
    public String toString()
    {
        return "java.lang.Exception: n or p should not be negative.";
    }
}

public class Ex2 {
    static void validatenp(int n, int p) throws Neg1, Neg2
    {
        if(n<0 || p<0 || Math.pow(n,p)<0)
        {
            throw new Neg2();
        }
        if(n==0 && p==0)
        {
            throw new Neg1();
        }
        else
        {
            System.out.println((int)Math.pow(n,p));
        }
    }
    
    public static void main(String[] args) throws Neg1, Neg2 {
        
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++) 
       {
        try
        {
            
            int n = sc.nextInt();
            int p = sc.nextInt();
            validatenp(n,p);
            
        }
         catch(Neg1 N1)
        {
            System.out.println(N1);
        }
        catch(Neg2 N2)
        {
            System.out.println(N2);
        }
       
       }
       sc.close();
       
        
    }
}