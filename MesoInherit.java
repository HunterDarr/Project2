
public class MesoInherit extends MesoAbstract {
	
	private String stid;
	
	private int[] asciiNumbers = new int[4];
	private int[] calculatedAscii = new int[3];  //Might need to be public
	
	public MesoInherit (String stid)   {
		this.stid = stid;
		calculateAscii();
		
	}
	
	public MesoInherit (MesoStation stid)    {
		this.stid = stid.getStID();
		calculateAscii();
	}
	
	public void calculateAscii ()   {
		for (int i = 0; i < 4; i++ )   {
			asciiNumbers[i] = (int)stid.charAt(i);
			
//			System.out.println(asciiNumbers[i]);   //testing
		}
		
	}

	@Override
	int[] calAverage() {
		// TODO Auto-generated method stub
		double doubleAverage = (asciiNumbers[0] + asciiNumbers[1] + asciiNumbers[2] + asciiNumbers[3]) / 4.0;
		System.out.println("TEST: " + doubleAverage);
		int asciiCeil = (int)(Math.ceil(doubleAverage));
		calculatedAscii[0] = asciiCeil;
		
		int asciiFloor = (int)(Math.floor(doubleAverage));
		calculatedAscii[1] = asciiFloor;
		
		int asciiRound = (int)(Math.round(doubleAverage));
		calculatedAscii[2] = asciiRound;
		
		return calculatedAscii; //return an array
	}

	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		return 0;   //Change?
	}

}
