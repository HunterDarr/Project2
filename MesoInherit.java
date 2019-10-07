
public class MesoInherit extends MesoAbstract {
	
	private String stid;
	
	int[] asciiNumbers = new int[4];
	
	public MesoInherit (String stid)   {
		this.stid = stid;
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
		return null;
	}

	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
