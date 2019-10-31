
public class MesoInherit extends MesoAbstract {
	
	private String stid;
	/**
	 * An Array that holds the ASCII numbers of character in STID
	 */
	private int[] asciiNumbers = new int[4];
	
	/**
	 * An Array that holds the Ceil, Floor, and Rounded average of the average of the ASCII numbers
	 */
	private int[] calculatedAscii = new int[3];  //Might need to be public
	
	
	/**
	 * Constructor for this class that accepts String parameters
	 * @param stid
	 */
	public MesoInherit (String stid)   {
		this.stid = stid;
		calculateAscii();
		calculateAverage();
	}
	
	
	/**
	 * Constructor for this class that accepts MesoStation parameters
	 * @param stid
	 */
	public MesoInherit (MesoStation stid)    {
		this.stid = stid.getStID();
		calculateAscii();
		calculateAverage();
	}
	
	
	/**
	 * Calculates the ASCII numbers of each character in the given STID
	 */
	public void calculateAscii ()   {
		for (int i = 0; i < 4; i++ )   {
			asciiNumbers[i] = (int)stid.charAt(i);
		}
	}
	
	
	/**
	 * Calculates the Ceiling, Floor, and Rounded average of the average of the ASCII numbers
	 */
	private void calculateAverage()   {
		double doubleAverage = (asciiNumbers[0] + asciiNumbers[1] + asciiNumbers[2] + asciiNumbers[3]) / 4.0;
//		System.out.println("TEST: " + doubleAverage);   //Testing
		int asciiCeil = (int)(Math.ceil(doubleAverage));
		calculatedAscii[0] = asciiCeil;
		
		int asciiFloor = (int)(Math.floor(doubleAverage));
		calculatedAscii[1] = asciiFloor;
		
		int asciiRound = (int)(Math.round(doubleAverage));
		calculatedAscii[2] = asciiRound;
	}

	
	/**
	 * Returns calculatedAscii.
	 */
	@Override
	int[] calAverage() {
		// TODO Auto-generated method stub
		
		
		return calculatedAscii; //return an array
	}

	/**
	 * Returns the rounded average of calculatedAscii.
	 */
	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		char letterAverage = (char)calculatedAscii[2];
		return letterAverage;   //Change?
	}

}
