package HowToFindLengthofString;

public class HowToFindLengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given ="SathyaSeelan";
		//System.out.println(given.length());--easyway
		char[] charac= given.toCharArray();
		int length = 0;
		for (char c : charac) {
			length++;
			
		}
		System.out.println(length);
		
		
	}

}
