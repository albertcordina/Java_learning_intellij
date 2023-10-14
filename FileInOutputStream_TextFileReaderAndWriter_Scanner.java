import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInOutputStream_TextFileReaderAndWriter_Scanner {
    static private String text;
    static private String linkToTheFile;

//----------------------------------- WRITE INTO A FILE -----------------------------------------
    public static void writeToFile (String text, String linkToTheFile) throws IOException {

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream (linkToTheFile); // link the output file;

                byte [] nameBytes = (text).getBytes();     // converting the text from the String into the bytes;
                fileOutputStream.write(nameBytes);        // writes the text into the file as a text;
        }
        finally {if (fileOutputStream != null) {fileOutputStream.close();} // close the method 'write';
        }
    }
//-------------------------------------- READ A FILE ---------------------------------------------
    public static void readAndDisplayFile  (String linkToTheFile) throws IOException { // the method is only for one file;

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(linkToTheFile);  // new object to link to the file;

            int currentByte;
            System.out.println("\nthe content of the file:\n");
            while ((currentByte = fileInputStream.read()) != -1) { // iterate and read the whole file;
                System.out.print((char) currentByte);}
        }
        finally { if (fileInputStream != null) { fileInputStream.close();} // close the method 'read';
        }
    }
//-------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String option;

        do {
            System.out.print("\n\n\t\t - Menu -\n\nPress '1' to write a text to the file\n" +
                    "Press '2' to read a file from your PC\nPress '3' to Exit the program\nEnter your option: ");
            option = scan.nextLine();

            switch (option) {

                case "1":
                    System.out.print("Enter the text to write into the file: ");
                    text = scan.nextLine();

                    System.out.print("Enter the link to your file: ");
                    linkToTheFile = scan.nextLine();

                    try {
                        writeToFile(text, linkToTheFile); // call the method above;
                        System.out.println("The text have been successfully written to the file."); }       // report a successful written info;
                    catch (IOException e) { System.err.println("An error occurred while writing to the file: " + e.getMessage()); } // if Error;
                    break;

                case "2":
                    System.out.print("Enter the link to your file: ");
                    linkToTheFile = scan.nextLine();

                    try { readAndDisplayFile(linkToTheFile); }  // call the method above;
                    catch (IOException e) { System.err.println("An error occurred while reading the file: " + e.getMessage()); } // if Error;
                    break;

                case "3":
                    System.out.println("Thank you for your session!");
                    break;

                default:
                    System.out.println("Invalid choice.\n");
            }
        } while (!option.equals("3")) ;
          scan.close();
    }
}