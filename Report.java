
public class Report {

        private static String [][] myList;
        private static int row;

        public Report(String[][] myList, int row) {
                this.myList = myList;
                this.row = row;
        }

        public static String[][] ArtistCountNStreamedTime() {

                // newList will contain an artist name, the number of
                // times s/he appears in the Data set, and as a bonus I
        		// will count the number of times an artist's song has been streamed 

                String[][] newList = new String[row][3];
                int i = 0; // 'i' will keep track of the number of row of myList while
                int z = 0; // 'z' will keep the number of row of the new list
                int count, streamedNum;
                String artist = "";
                boolean artistCounted;
                
                while(i < row) {
                        artist = myList[i][2];
                        count = streamedNum = 0;
                        artistCounted = false;
                        
                        for (int k = 0; k < row; k++) 
                                if(artist.equals(newList[k][0]))
                                        artistCounted = true;
                        
                         if (artistCounted == false) {
                        	 newList[z][0] = artist;
                        	 
                             for(int j = 0; j < row; j++)
                            	 if(artist.equals(myList[j][2])) {
                                 	count++;
                                 	streamedNum += Integer.parseInt(myList[j][3]);
                                 	
                            	 }
                              newList[z][1] = Integer.toString(count);
                              newList[z][2] = Integer.toString(streamedNum);
                              z++;
                                 
                         }

                         i++;
                            
                    }
           
                // Now that we have the artists and the number of times they appear, I want
                // to copy newList into a new array list because, newList has some null values 
                
                String[][] list = new String[z][3];
                
                for(int o = 0; o < z; o++)
                	for(int r = 0; r < 3; r++)
                		list[o][r] = newList[o][r];
   
                    return list;

            }

    } // end Report

