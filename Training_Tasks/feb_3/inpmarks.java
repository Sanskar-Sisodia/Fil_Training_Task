
public class inpmarks {
    
    public static void main(String[] ar)
    {
        int marks;
        marks= Integer.parseInt(ar[0]);

        if(marks>60&& marks<=75)
        {
            System.out.println("The grade is B");
        }
        if(marks>50&& marks<=60)
        {
            System.out.println("The grade is C");
        }
        if(marks>=0&& marks<=50)
        {
            System.out.println("The grade is F");
        }
        if(marks>75&& marks<=100)
        {
            System.out.println("The grade is A");
        }
        else{
            try{
                throw new MarksOutOfRange();
            }
            catch (MarksOutOfRange e)
            {
                System.err.println(e);
            }
        }
        
    }
}
