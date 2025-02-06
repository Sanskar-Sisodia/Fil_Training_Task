import java.io.*;
class Counter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Acer\\Desktop\\Sanskar.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
