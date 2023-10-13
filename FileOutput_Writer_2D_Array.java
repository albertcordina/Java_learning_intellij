import java.io.*;
public class FileOutput_Writer_2D_Array {

                 //             WORKS FOR ANY FORMAT OF THE FILES:
    public static void writeStudentRecordsToFile(String [][] studentRecords, String fileName) throws IOException {

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("//home//dci-student//Desktop//NIOFiles//test.csv");
         //   fileOutputStream = new FileOutputStream("//home//dci-student//Desktop//NIOFiles//testCsv.txt");

            for (String[] record : studentRecords) {                 // iterate the whole Array;
                String theLine = String.join (",", record) + "\n";  // join the 'comma' and the next line '\n' to the new String 'theLine';
                byte[] lineBytes = theLine.getBytes();             // convert the whole updated text/list of the 'theLine' to bytes 'lineBytes';
                fileOutputStream.write(lineBytes);}               // write the converted 'lineBytes' into the file;
        }
        finally {
            if (fileOutputStream != null) {fileOutputStream.close();}
        }
    }
//--------------------------------------------------------
    public static void main(String[] args) {

        String [][] studentRecords = {
                {"101", "Alice", "3.8"}, // the 3 different attributes (ID, Name, GPA);
                {"102", "Bob", "3.5"},
                {"103", "Charlie", "3.2"},
                {"104", "David", "3.9"},
                {"105", "Eve", "3.7"}
        };

        String fileName = ".............";

        try {
            writeStudentRecordsToFile(studentRecords, fileName); // call the method above;
            System.out.println("Student records have been successfully written to " + fileName);} // report the successfully writing into the file;
        catch (IOException e) { System.err.println("An error occurred while writing to the file: " + e.getMessage());} // if Error;
    }
}