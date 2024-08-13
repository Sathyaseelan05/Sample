package HowToFindLengthofString;

public class FindCountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given = "Welcome to the Real World";
		
	    int count =0;
	    for(int s= 0; s<given.length()-1; s++) {
	    	
	    	if(given.charAt(s)==' ' && given.charAt(s+1)!=' ') {
	    		
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);

	}

}
