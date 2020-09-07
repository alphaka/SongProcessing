# SongProcessing
Processing A List Of Top Streamed Songs From Spotify


This program is object-oriented and is composed of three classes.

*The first class CSVReader.java has a constructor that takes the path of the Dataset to be read, 
the number of rows and columns of the new 2D array we want the data to be stored in.
CSVReader has a method called Data() which returns the stored data in a new 2D array that has
the position, the title of a song,  an artist's name,  and the number of times that song has been streamed.

*The second class Report.java has a constructor that takes the stored 2D array, and the number of rows it has.
The class has a method called ArtistCountNStreamedTime() that return another 2D array, but this time the array
has the name of an artist, counts the number of times s/he appeared from the 2D array passed to Report's
constructor, and counts as well the number of times his/her song has been streamed.

*Finally, we have the main that have three methods.
- The first method 'main' has the object 'data' which is an  instance of CSVReader, then 'data' is used to
  access the Data() method inside CSVReader and finally pass to the constructor of Report.
  The 'main' method calls as well the methods printReport() and sortAndPrintArtistList()
- The printReport() method's goal is to print the 2D array return by the Report.ArtistCountNStreamedTime()
  in a file called 'Artists-Daily08312020.csv'
- The sortAndPrintArtistList() method takes Report.ArtistCountNStreamedTime() as a parameter, then retrieve
  the name of the artists from the 2D array and put them inside a 1D array 'artistList'.
  Then I used the java build-in sorting method to sort alphabetically the name of the artist and finally
  printed the list in a file named 'Sorted Artist's List.csv'
