import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

	private static PrintStream ps;
	public static void main(String [] args) {
        
	String path = "/Users/alpha/Desktop/Lab#2/Dataset.csv";
        int row = 200;
        int col = 4;
        
        // 'data' is a instance of CSVReader that takes the path, 
        // the number of row and column of the Dataset to be read from 'path'
     
        CSVReader data  = new CSVReader(path, row, col);
        
        // The first parameter of the constructor Report will get the 2D array
        // read from the CSVReader above
        
        new Report(data.Data(), row);
        
        // 'list' contains the artist's name, the number of times they appear from
        // in the dataset, and as a bonus the number of times s/he songs has been streamed
        
        String[][] list = Report.ArtistCountNStreamedTime();
        
        printReport(list);
        
        // Extra credit (Alphabetizing artistName)
        sortAndPrintArtistList(list);     

	}

	private static void sortAndPrintArtistList(String[][] list){
		try {
			ps = new PrintStream(new File("/Users/alpha/Desktop/Lab#2/Sorted Artist's List.csv"));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		String[] artistList = new String[list.length];
        for(int i = 0; i < list.length; i++)
        	artistList[i] = list[i][0];
        
        // I used the java build-in Arrays sort method to sort 'artistList'
        Arrays.sort(artistList);
        
        ps.printf("Artists\t\t\t\n");
        for(int j = 0; j < artistList.length; j++)
        	ps.printf(artistList[j]+"\n");
	}

	private static void printReport(String[][] list) {
		try {
			ps = new PrintStream(new File("/Users/alpha/Desktop/Lab#2/Artists-Daily08312020.csv"));
        	} catch (FileNotFoundException e) {
        		System.err.println(e.getMessage());
        	}

           	ps.printf("Artist             ,Number of Appearances      ,Total Number of Streamed time    ");

           	for(int i = 0; i <list.length; i++)
           		ps.printf("\n"+list[i][0]+","+list[i][1]+","+list[i][2]);
   }
	
}
	
	
