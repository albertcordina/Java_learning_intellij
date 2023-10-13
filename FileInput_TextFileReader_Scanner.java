import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FileInput_TextFileReader_Scanner {

        static private String linkToTheFile;

        public static void readAndDisplayFile  (String linkToTheFile) throws IOException { // the method is only for one file;

            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(linkToTheFile); // new object to link to the file;
                int currentByte;
                System.out.println("\nthe content of the file:\n");
                while ((currentByte = fileInputStream.read()) != -1) {

                    System.out.print((char) currentByte);} // iterate and read the whole file;
            }
            finally {
                if (fileInputStream != null) { fileInputStream.close();} // close the method 'read';
            }
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String option;

            do {
                System.out.print("\t\t- Menu -\n\nPress '1' to read a file from your PC\nPress '2' to Exit the program\nEnter your option: ");
                option = scan.nextLine();

                switch (option) {
                    case "1":
                        System.out.print("Enter the link to your file: ");
                        linkToTheFile = scan.nextLine();

                        try {
                            readAndDisplayFile(linkToTheFile);  // call the method above;
                            System.out.println("\nOperation was successful."); }  //  report a successfully reading;
                        catch (IOException e) {
                            System.err.println("An error occurred during the operation: " + e.getMessage()); } // if Error;
                        break;

                    case "2":
                        System.out.println("Thank you for your session!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
                while (option == "2") ;
                scan.close();
    }
}

