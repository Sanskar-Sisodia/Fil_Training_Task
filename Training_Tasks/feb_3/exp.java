import java.util.*;
class expect
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name");
        String nm=sc.nextLine();
        if(nm.equals("Java"))
            System.out.println("wow!"+nm);
        else
        {
            try
            {
                throw new NoMatchException();
            }
            catch(NoMatchException e)
            {
                System.err.println(e);
            }       

        }
    }
}
