import java.io.*;
public class fileCopy {

    FileInputStream f1;
    FileOutputStream f2;

    try{
        f1=new FileInputStream("source.txt");
    }
    catch(FileNotFoundException e)
    {
        System.out.println("Cannot find the file to read.");
        return;
    }

    try{
        f2=new FileOutputStream("dest.txt");
    }
    catch(FileNotFoundException e1)
    {
        System.out.println("Cannot create the destination file");
        return;
    }

    int i;
    do{
        i=f1.read();
        if(i!=-1)
        {
            f2.write(i);
        }
    }while(i!=-1);
    f1.close();
    f2.close();

    system.out.println("Content copied successfully");
    
}
