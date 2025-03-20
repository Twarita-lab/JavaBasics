package interviewQuestions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LogFileSeparators_DTCC {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        String logFilePath = "path/to/your/logfile.log"; // Replace with your log file path
	        String successFilePath = "path/to/your/success.log";
	        String warningFilePath = "path/to/your/warning.log";
	        String failureFilePath = "path/to/your/failure.log";

	        try (Scanner scanner = new Scanner(new File(logFilePath));
	             PrintWriter successWriter = new PrintWriter(new FileWriter(successFilePath));
	             PrintWriter warningWriter = new PrintWriter(new FileWriter(warningFilePath));
	             PrintWriter failureWriter = new PrintWriter(new FileWriter(failureFilePath))) {

	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                if (line.contains("Success")) {
	                    successWriter.println(line);
	                } else if (line.contains("Warning")) {
	                    warningWriter.println(line);
	                } else if (line.contains("Failure")) {
	                    failureWriter.println(line);
	                }
	            }

	            System.out.println("Log file split successfully.");

	        } catch (IOException e) {
	            System.err.println("Error processing log file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	}


