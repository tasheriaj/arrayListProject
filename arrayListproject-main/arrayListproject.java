package arrayListwarmup;


import java.util.ArrayList;
import java.util.Arrays;

public class arrayListproject {
	
	public static void main (String[] args ) {
		
		ArrayList<String> sportsTypes = new ArrayList<>(Arrays.asList("Football", "Basketball", "Scoccer", "Golf", "Hockey"));
		
		System.out.println(sportsTypes);
		
		sportsTypes.remove("Football");
		sportsTypes.remove("Basketball");
		sportsTypes.remove("golf");
		
		
		System.out.println(sportsTypes);
		
		
				
		
	}
	

}
