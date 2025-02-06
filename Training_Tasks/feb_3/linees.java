import java.io.*;
public class linees {
    public static void main(String[] args) throws IOException {
       /*  FileOutputStream f1;
    try{
        f1=new FileOutputStream("a.txt");
    }
    catch(FileNotFoundException e){
        System.out.println("The file could not be created");
        return;
    }
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    System.out.println("Enter the contents of the file: ");
    int i;
    do{
        i=br.read();
        if((char)i!='$')
        {
            f1.write((char)i);
        }
    }while((char)i!='$');
    f1.close();
*/
    FileInputStream f2;
     try
     {
        f2= new FileInputStream("source.txt");
     }
     catch(FileNotFoundException e1)
     {
        System.err.println(e1);
        return;
     }
     int j;
     int count=1;
     do{
        j=f2.read();
        if((char)j=='\r')
        {
            count=count+1;
        }
     }while(j!=-1);
     System.out.println("Line count is " + count);
     f2.close();
    }
}
