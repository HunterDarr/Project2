import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PosAvg {
	
	private String[] stationIdList = new String[0];
	
	private int capacity = 0;
	
	private String stid;
	
	private int indexOfStation;
	
	
	public PosAvg(String stid) throws IOException   {
		this.stid = stid;
		read();
	}
	
	
	/**
	 * This method skips 3 lines in the Mesonet.txt file and then proceeds to read the Station Id's from 
	 * Mensonet.txt into an array. This method also calculates the index of the stid.
	 * @throws IOException
	 */
	private void read() throws IOException   {
		BufferedReader fileIn = new BufferedReader(new FileReader("Mesonet.txt"));   //This read method is a modified method from Project 1
		for (int i = 0; i < 3; i++)   {
			fileIn.readLine();
		}
		
		String newStationId = fileIn.readLine().substring(1, 5);
//		System.out.println(newStationId);  //Testing
		
		//Make a for loop to read everything in line by line making a new array every time to add 1. if readline == null then stop
		while (newStationId != null)   {
			int tempCapacity = capacity;
			capacity = capacity + 1;  // Note to self: Might need to change later if it causes problems
			
			//Finds the index of the STID
			if ( this.stid.equals(newStationId))   {
				indexOfStation = capacity;
			}
			
			String[] biggerArray = new String[capacity];
			biggerArray[capacity - 1] = newStationId;
			
			if ( tempCapacity != 0)   {
				for ( int i = 0; i < tempCapacity; i++ )   {
					biggerArray[i] = stationIdList[i];
				}
			}
			else   {
				biggerArray[0] = newStationId;
			}
			
	    	stationIdList = biggerArray;
//	    	System.out.println(newStationId);  //Testing
	    	newStationId = fileIn.readLine();
	    	
	    	if (newStationId != null)  {
	    		newStationId = newStationId.substring(1, 5);
	    	}
		}
		fileIn.close();
	}
	
	public int indexOfStation()   {
		return indexOfStation;
	}
	
	
	
	@Override
	public String toString()   {
		System.out.println(indexOfStation);   //Testing
		System.out.println(stationIdList[indexOfStation - 1]);
		return "This index is average of " + stationIdList[indexOfStation -2] + " and " + stationIdList[indexOfStation] + 
				", " + stationIdList[indexOfStation -3] + " and " + stationIdList[indexOfStation +1] + ", and so on.";   //NOT DONE!!!
	}
}
