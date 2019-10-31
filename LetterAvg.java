import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg {
	
	/**
	 * Stores the number of stids found the have the same letter average.
	 * Calculated in LetterAvg.
	 */
	private int numberOfStations = 0;
	
	/**
	 * An ArrayList of stids that start with a given letter average found in LetterAvg.
	 */
	private ArrayList<String> matchingStids = new ArrayList<String>();
	
	/**
	 * A reference to stationIdList found in PosAvg.
	 */
	private String[] newArrayReference;
	
	
	/**
	 * Finds the number of stids in Mesonet.txt that start with the given letter average.
	 * Stored in numberOfStations & matchingStids.
	 * @param averageLetter
	 * @throws IOException
	 */
	public LetterAvg(char averageLetter) throws IOException   {
		PosAvg array = new PosAvg("ARRY");
		newArrayReference = array.stationIdList;
		
		for (int i = 0; i < newArrayReference.length; i++ )   {   //May need to copy read() method instead of using a public array
			if (newArrayReference[i].charAt(0) == averageLetter )   {
				numberOfStations = numberOfStations + 1;
				matchingStids.add(newArrayReference[i]);
			}
		}
		
	}
	
	
	/**
	 * Returns numberOfStations
	 * @return
	 */
	public int numberOfStationWithLetterAvg()   {
		return numberOfStations;
		
	}
	
	/**
	 * Overrides the toString() method to the desired format.
	 * Example: 
	 * 
	 * They are:
	 * IDAB
	 * INOL
	 * 
	 */
	@Override
	public String toString()   {
		String response = "";
		for (int i = 0; i < matchingStids.size(); i++ )   {
			if (i == matchingStids.size() - 1)   {
				response = response + matchingStids.get(i);
			}
			else {
				response = response + matchingStids.get(i) + "\n";
			}
			
		}
		return "\nThey are:\n" + response; //Change
	}

}
