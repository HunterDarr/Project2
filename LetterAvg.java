import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg {
	
	private int numberOfStations = 0;
	
	private ArrayList<String> matchingStids = new ArrayList<String>();
	
	private String[] newArrayReference;
	
	
	
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
	
	
	
	public int numberOfStationWithLetterAvg()   {
		return numberOfStations;
		
	}
	
	@Override
	public String toString()   {
		String response = "";
		for (int i = 0; i < matchingStids.size(); i++ )   {
			response = response + matchingStids.get(i) + "\n";
		}
		return "They are:\n" + response; //Change
	}

}
