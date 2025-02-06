import java.io.*;
public class copyfile {
    public static void main(String []ar) throws IOException
    {
        FileInputStream fIs;
        FileOutputStream fOs;
        try
        {
        fIs= new FileInputStream("source.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Source file not found");
            return;
        }

        try
        {
        fOs= new FileOutputStream("dest.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Dest. file not  created");
            return;
            // fIs.close();     
        }

        int i;
        do{
            i=fIs.read();
            if(i!=-1){
                fOs.write(i);
            }
        }while(i!=-1);
        fIs.close();
        fOs.close();
        System.out.println("\n File copied successfully.");
        
    }
}
