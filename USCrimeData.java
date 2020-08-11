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

import java.util.*;

public class USCrimeData {

    private static int row;
    private static int columns;
    private String[][] crime2DArray;
    private String maxMurder;
    private String minMurder;
    private String maxRobbery;
    private String minRobbery;



    public USCrimeData() {

    }



    /* ------------------------------ IMPORT DATA AND ASSIGNING TO AN ARRAY ------------------------------ */


    //Add's the files contents to a 2D array, it does this by incrementally building our crime2DArray and assigning tempArrays values to it
    public void addTo2DArray(String[] tmpArray, int minCapacity) {

        String[][] crime2DArray = new String[row][columns]; //Constructs Array

        // 21 > row
        if (minCapacity > row) {

            row = 22;

            String[][] newArray = new String[row][columns];

            for(int i=0; i<crime2DArray.length; i++) {
                for(int j=0; j<crime2DArray[i].length; j++) {
                    newArray[i][j]=crime2DArray[i][j];
                }
            }
            this.crime2DArray = newArray;
        }
        this.crime2DArray[minCapacity-1] = tmpArray;
    }

    /* ------------------------------ GETTERS AND SETTERS ------------------------------ */

    // End Test data

    /* ------------------------------ POPULATION GROWTH ------------------------------ */

    public void setPopGrowth() {

    }
    public void getPopGrowth() {
        //1994 - 1995
        double growthYear0 = (((.262803276 - .260327021) / .260327021)*100);
        System.out.println("1994 - 1995 was: " + String.format("%.4f", growthYear0) + "%");

        //1995 - 1996
        double growthYear1 = (((.265228572 - .262803276) / .262803276)*100);
        System.out.println("1995 - 1996 was: " + String.format("%.4f", growthYear1) + "%");

        //1996 - 1997
        double growthYear2 = (((.267783607 - .265228572) / .265228572)*100);
        System.out.println("1996 - 1997 was: " + String.format("%.4f", growthYear2) + "%");

        //1997 - 1998
        double growthYear3 = (((.270248003 - .267783607) / .267783607)*100);
        System.out.println("1997 - 1998 was: " + String.format("%.4f", growthYear3) + "%");

        //1998 - 1999
        double growthYear4 = (((.272690813 - .270248003) / .270248003)*100);
        System.out.println("1998 - 1999 was: " + String.format("%.4f", growthYear4) + "%");

        //1999 - 2000
        double growthYear5 = (((.281421906 - .272690813) / .272690813)*100);
        System.out.println("1999 - 2000 was: " + String.format("%.4f", growthYear5) + "%");

        //2000 - 2001
        double growthYear6 = (((.285317559 - .281421906) / .281421906)*100);
        System.out.println("2000 - 2001 was: " + String.format("%.4f", growthYear6) + "%");

        //2001 - 2002
        double growthYear7 = (((.287973924 - .285317559) / .285317559)*100);
        System.out.println("2001 - 2002 was: " + String.format("%.4f", growthYear7) + "%");

        //2002 - 2003
        double growthYear8 = (((.290788976 - .287973924) / .287973924)*100);
        System.out.println("2002 - 2003 was: " + String.format("%.4f", growthYear8) + "%");

        //2003 - 2004
        double growthYear9 = (((.293656842 - .290788976) / .290788976)*100);
        System.out.println("2003 - 2004 was: " + String.format("%.4f", growthYear9) + "%");

        //2004 - 2005
        double growthYear10 = (((.296507061 - .293656842) / .293656842)*100);
        System.out.println("2004 - 2005 was: " + String.format("%.4f", growthYear10) + "%");

        //2005 - 2006
        double growthYear11 = (((.299398484 - .296507061) / .296507061)*100);
        System.out.println("2005 - 2006 was: " + String.format("%.4f", growthYear11) + "%");

        //2006 - 2007
        double growthYear12 = (((.301621157 - .299398484) / .299398484)*100);
        System.out.println("2006 - 2007 was: " + String.format("%.4f", growthYear12) + "%");

        //2007 - 2008
        double growthYear13 = (((.304059724 - .301621157) / .301621157)*100);
        System.out.println("2007 - 2008 was: " + String.format("%.4f", growthYear13) + "%");

        //2008 - 2009
        double growthYear14 = (((.307006550 - .304059724) / .304059724)*100);
        System.out.println("2008 - 2009 was: " + String.format("%.4f", growthYear14) + "%");

        //2009 - 2010
        double growthYear15 = (((.309330219 - .307006550) / .307006550)*100);
        System.out.println("2009 - 2010 was: " + String.format("%.4f", growthYear15) + "%");

        //2010 - 2011
        double growthYear16 = (((.311587816 - .309330219) / .309330219)*100);
        System.out.println("2010 - 2011 was: " + String.format("%.4f", growthYear16) + "%");

        //2011 - 2012
        double growthYear17 = (((.313873685 - .311587816) / .311587816)*100);
        System.out.println("2011 - 2012 was: " + String.format("%.4f", growthYear17) + "%");

        //2012 - 2013
        double growthYear18 = (((.316128839 - .313873685) / .313873685)*100);
        System.out.println("2012 - 2013 was: " + String.format("%.4f", growthYear18) + "%");


    }


    /* ------------------------------ MAXIMUM AND MINIMUM ------------------------------ */

    public void setMaxMurder() {

    }

    public String getMaxMurder() {
        String[] addToArray = new String[21];
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                addToArray[i] = crime2DArray[i][5]; // put [i] in the first bracket and number in the second [] to find values in the column; put a [] number in the first and [i] in the second to find row
            }
        }
        Arrays.sort(addToArray);
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                if (crime2DArray[i][5].equalsIgnoreCase(addToArray[19])) //locates the value in the 2D array
                    maxMurder = crime2DArray[i][0]; // locates and assigns the value to the corresponding year
            }
        }
        return maxMurder;
    }

    public void setMinMurder() {

    }

    public String getMinMurder() {
        String[] addToArray = new String[21];
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                addToArray[i] = crime2DArray[i][5]; // put [i] in the first bracket and number in the second [] to find values in the column; put a [] number in the first and [i] in the second to find row
            }
        }
        Arrays.sort(addToArray);
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                if (crime2DArray[i][5].equalsIgnoreCase(addToArray[0])) //locates the value in the 2D array
                    minMurder = crime2DArray[i][0]; // locates and assigns the value to the corresponding year
            }
        }
        return minMurder;
    }


    // Robbery Max and Min
    public void setMaxRobbery() {

    }

    public String getMaxRobbery() {
        String[] addToArray = new String[21];
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                addToArray[i] = crime2DArray[i][9]; // put [i] in the first bracket and number in the second [] to find values in the column; put a [] number in the first and [i] in the second to find row
            }
        }
        Arrays.sort(addToArray);
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                if (crime2DArray[i][9].equalsIgnoreCase(addToArray[19])) //locates the value in the 2D array
                    maxRobbery = crime2DArray[i][0]; // locates and assigns the value to the corresponding year
            }
        }
        return maxRobbery;
    }

    public void setMinRobbery() {

    }

    public String getMinRobbery() {
        String[] addToArray = new String[21];
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                addToArray[i] = crime2DArray[i][9]; // put [i] in the first bracket and number in the second [] to find values in the column; put a [] number in the first and [i] in the second to find row
            }
        }
        Arrays.sort(addToArray);
        for (int i = 0; i <= crime2DArray[i].length; i++) {
            for (int j = 0; j <= crime2DArray[j].length; j++) {
                if (crime2DArray[i][9].equalsIgnoreCase(addToArray[0])) //locates the value in the 2D array
                    minRobbery = crime2DArray[i][0]; // locates and assigns the value to the corresponding year
            }
        }
        return minRobbery;
    }

    // End Getter and Setter


    /* ------------------------------ TIMESTAMP AND THANK YOU MESSAGE ------------------------------ */

    public void exitThankYou() {
        System.out.println();
        System.out.println("Thank you for trying the US Crimes Statistics Program");
        System.out.println();
    }
}
