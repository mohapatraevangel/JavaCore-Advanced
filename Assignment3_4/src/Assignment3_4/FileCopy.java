package Assignment3_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Define the source and destination files
        String sourceFile = "C:\\Users\\SonamKumari\\Downloads\\photo.jpg"; // Replace with the path to your photo
        String destinationFile = "C:\\Users\\SonamKumari\\Downloads\\Copyphoto.jpg"; // Replace with the destination path

        // Start time for performance measurement
        long startTime = System.nanoTime();

        // Use FileInputStream and FileOutputStream to copy the file
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;

            // Read byte by byte from the source file and write it to the destination file
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");


        } catch (IOException e) {
            e.printStackTrace();
        }

        // End time for performance measurement
        long endTime = System.nanoTime();

        // Calculate and print the performance improvement
        long duration = endTime - startTime;
        System.out.println("Time taken with buffering: " + duration + " nanoseconds");


    }


}