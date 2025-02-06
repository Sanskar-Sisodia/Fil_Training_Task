class marks
{
    public static void main(String []ar)
    {
        int mark=Integer.parseInt(ar[0]);
        try {
                if (mark < 0 || mark > 100) {  
                    throw new MarksOutOfRangeException();
                }
            } 
        catch (MarksOutOfRangeException e) 
        {
            System.out.println("Marks should be between 0 and 100.");
        }
        if(mark>=75 && mark<=100)
        {
            System.out.println("Grade achieved:"+'A');
        }
        else if(mark>=64 && mark<74)
        {
            System.out.println("Grade achieved:"+'B');
        }
        else if(mark>=50 && mark<59)
        {
            System.out.println("Grade achieved:"+'C');
        }
        else if(mark>=0 && mark<49)
        {
            System.out.println("Grade achieved:"+'F');
        }
        
    }
}
