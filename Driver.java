/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-09-18
*/
import java.io.IOException;

public class Driver 
{
	public static void main(String[] args) throws IOException 
	{
//		PosAvg posAvg = new PosAvg("NRMN");   //Testing
//		System.out.println("The Index of the city is: " + posAvg.indexOfStation());   //Testing
//		System.out.println(posAvg);   //Testing
//		MesoInherit mesoInherit = new MesoInherit("NRMN");   //Testing
//		System.out.println("Ascii Ceiling is " + mesoInherit.calAverage()[0]);   //Testing
//		System.out.println("Ascii Floor is " + mesoInherit.calAverage()[1]);   //Testing
//		System.out.println("Ascii Average is " + mesoInherit.calAverage()[2]);   //Testing
//		String stID = "NRMN";   //Testing

		
		
		
		
		String stID = "OKCE";
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		
		PosAvg posAvg = new PosAvg(stID);
		System.out.println("The Index of the city is: " + posAvg.indexOfStation());
		System.out.println(posAvg);
		System.out.print("\n");
		
		System.out.println("Ascii Ceiling is " + mesoInherit.calAverage()[0]);
		System.out.println("Ascii Floor is " + mesoInherit.calAverage()[1]);
		System.out.println("Ascii Average is " + mesoInherit.calAverage()[2]);
		System.out.print("\n");
		
		System.out.println("Letter Avg: " + mesoInherit.letterAverage());
		System.out.print("\n");
		
		LetterAvg letterAvg = new LetterAvg(mesoInherit.letterAverage());
		System.out.println("Total number of stations starting with letter '" + mesoInherit.letterAverage() + "' is " + letterAvg.numberOfStationWithLetterAvg() + ".");
		
		System.out.print(letterAvg);
	}
}