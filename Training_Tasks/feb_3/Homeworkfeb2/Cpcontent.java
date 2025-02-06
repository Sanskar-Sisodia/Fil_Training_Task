import java.io.*;

class Cpcontent {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Acer\\Desktop\\Sanskar.txt";  
        String destinationFile = "C:\\Users\\Acer\\Desktop\\sisodia.txt";  

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
