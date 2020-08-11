/*
 * Francis Bui
 * CMIS 141: Rebecca Rowson
 *
 * Final Project: US Crime Statistical Program
 *
 * Description of program: The purpose of this program
 * is import the Crime.csv file where the data from the
 * file is read, line by line, and assigned to an array.
 * Based on the question the user chooses, the answer
 * will print from data retrieved from the array.
 *
 */

import java.io.*;
import java.time.*;
import java.util.*;


public class TestCrimeRates {

    public static void main(String[] args) {

        Instant start = Instant.now(); // Timestamp begins

        /* ------------------------------ IMPORTING CRIMES.CSV DATA FILE ------------------------------ */


        String fileLine; //Variable to hold tokens in
        int i=0; //Variable to increment minCapacity

        USCrimeData dataCrimeRates = new USCrimeData();
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader(args[0])); //A reader to read the commandArgs file and this reader is put into a buffered reader for efficiency
            while ((fileLine = inputStream.readLine()) != null) { //While there is still lines to be read
                dataCrimeRates.addTo2DArray(fileLine.split(","), ++i); //Passes in a String array where it splits every "," and a counter to increment minCapacity
            }
            inputStream.close(); //Closes the file Stream after we are done reading from it
        }
        catch (IOException ex) {
            ex.printStackTrace(); //Prints the stack trace for troubleshooting
        }

        /* ------------------------------ WELCOME MESSAGE AND PROGRAM BEGINS ------------------------------ */

        String userInput;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("***************************************************************************************************");
        System.out.println("*************************** WELCOME TO THE US CRIME STATISTICAL PROGRAM ***************************");
        System.out.println("***************************************************************************************************");
        System.out.println();


        do {
            System.out.println();
            System.out.println("Enter the number of the question you want answered. Enter 'Q' to quit the program: ");
            System.out.println();
            System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 – 2013?");
            System.out.println("2. What year was the Murder rate the highest?");
            System.out.println("3. What year was the Murder rate the lowest?");
            System.out.println("4. What year was the Robbery rate the highest?");
            System.out.println("5. What year was the Robbery rate the lowest?");
            System.out.println("Q. Quit the program");
            System.out.println();
            System.out.print("Enter your selection: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("1")) {
                System.out.println();
                System.out.println("The Population growth from ");
                System.out.println();
                dataCrimeRates.getPopGrowth();
                System.out.println();
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.println();
                System.out.println("The Murder rate was highest in " + dataCrimeRates.getMaxMurder());
                System.out.println();
            } else if (userInput.equalsIgnoreCase("3")) {
                System.out.println();
                System.out.println("The Murder rate was lowest in " + dataCrimeRates.getMinMurder());
                System.out.println();
            } else if (userInput.equalsIgnoreCase("4")) {
                System.out.println();
                System.out.println("The Robbery rate was highest in " + dataCrimeRates.getMaxRobbery());
                System.out.println();
            } else if (userInput.equalsIgnoreCase("5")) {
                System.out.println();
                System.out.println("The Robbery rate was lowest in " + dataCrimeRates.getMinRobbery());
                System.out.println();
            } else if (userInput.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println();
                System.out.println("Input value was invalid, please choose a valid option...");
                System.out.println();
            }

        } while (!userInput.equalsIgnoreCase("q"));


        /* ------------------------------ PROGRAM EXITS AND THANK YOU MESSAGE ------------------------------ */

        Instant end = Instant.now();
        dataCrimeRates.exitThankYou();
        double timeElapsed = Duration.between(start, end).toSeconds();
        System.out.println("Elapsed time in seconds was : " + timeElapsed);
    }
}
