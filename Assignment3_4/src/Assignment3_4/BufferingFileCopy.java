package Assignment3_4;

import java.io.*;

public class BufferingFileCopy {
    public static void main(String[] args) {
        // Define the source and destination files
        String sourceFile = "C:\\Users\\SonamKumari\\Downloads\\photo.jpg"; // Replace with the path to your photo
        String destinationFile = "C:\\Users\\SonamKumari\\Downloads\\Copyphoto.jpg"; // Replace with the destination path

        // Start time for performance measurement
        long startTime = System.nanoTime();

        // Use BufferedInputStream and BufferedOutputStream to copy the file
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            int byteData;

            // Read and write byte by byte from the source to the destination file using buffers
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
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