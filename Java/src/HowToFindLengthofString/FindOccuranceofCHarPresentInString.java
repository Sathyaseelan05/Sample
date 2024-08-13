package HowToFindLengthofString;

public class FindOccuranceofCHarPresentInString {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "SathyaSeelan";
		char tofind = 'a';
		int times = 0;
		
		for(int s=0; s<given.length();s++ ) {
			
			if(given.charAt(s)==tofind) {
				
				times = times +1;
				
			}		
		}
		System.out.println(times);
		
	}

}
