package Exception;

import java.util.Scanner;
public class Use_exception {
    public static void main(String[] args)
    {

        Use_exception obj=new Use_exception ();
        try
        {
            obj.demo();
        }
        catch ( Namrata_Exp  e)
        {
            System.out.println("MSG="+e.getMessage());
        }

    }

    public void demo() throws Namrata_Exp
    {
        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Numbers : ");
        num1=sc.nextInt();
        if(num1>0)
        {
            throw new  Namrata_Exp ("It is an Positive Number");
        }
        else
        {
            throw new  Namrata_Exp ("It is an Negative Number");
        }
    }

}



