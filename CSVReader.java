
/**
* The goal of this class is to read from a CSV file and put the
* contain inside a 2D arry.
* The constructor will take the path of the CSV, the number
* of rows, and columns of the array that we would like the data to be put in.
*/

import java.io.*;
import java.util.Scanner;

	public class CSVReader {

	        private String path;
	        private int row, col;

	        public CSVReader(String path, int row, int col) {
	                this.path = path;
	                this.row = row;
	                this.col = col;
	        }



	        public String[][] Data() {

	                String[][] myList = new String[row][col];

	                try {

	                        Scanner sc = new Scanner(new FileReader(path));

	                        // lineN will keep track of every single line from the CSV Data
	                        int lineN = 0;
	                        String[] lineValues;

	                        while(sc.hasNextLine()) {
	                                String line = sc.nextLine();
	                                lineValues = line.split(",");

	                                        for (int i = 0; i < 4 ; i++) {
	                                        // The reason I have the below If-statement is to clean the dataset from unwanted
	                                        // quotes

	                                                if ( (i == 1 || i == 2) && lineValues[i].charAt(0) == '"') {
	                                                        myList[lineN][i] = lineValues[i].substring(1,lineValues[i].length()-1);
	                                                } else {
	                                                        myList[lineN][i] = lineValues[i];
	                                                }
	                                        }

	                                lineN++;
	                                

	                        }

	                } catch (FileNotFoundException e) {
	                        System.err.println(e.getMessage());
	                }

	                return myList;

	        } // end Data()

	} // end CSVReader
