import javax.xml.transform.Result;

import org.omg.DynamicAny.DynAnySeqHelper;

public class SecondsInAYear {
	private static int secondsInADay = (60 * 60) * 24;
	private static int day = 365;
	private static long result = secondsInADay * day;

	public static void main(String[] args) {
		System.out.println("There are " + result + " in a year");

	}

}
