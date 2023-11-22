import java.io.*;
public class FileInput_TextFileReader {
    public static void readAndDisplayFile (String fileName) throws IOException { // the method is only for one file due to the one link to the file;

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("text.txt"); // new object to link to the file;
            int currentByte;
            while ((currentByte = fileInputStream.read()) != -1) { System.out.print((char) currentByte);} // iterate and read the whole file;
        }
        finally {
            if (fileInputStream != null) { fileInputStream.close();} // close the method 'read';
        }
    }

    public static void main(String[] args) {

        String fileName = "names.txt";

        try {
            readAndDisplayFile(fileName);  // call the method above;
            System.out.println("\nOperation was successful.");}  //  report a successfully reading;
        catch (IOException e) { System.err.println("An error occurred during the operation: " + e.getMessage());} // if Error;
    }
}