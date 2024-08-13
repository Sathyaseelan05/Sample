package ReverseString;

public class ReverseWord {
	
	public static void reverseeachword() {
		
		String given = "Sathya is a Monster";
		String rev="";
		String[] time = given.split(" ");
		
		for (String string : time) {
			StringBuffer buffer = new StringBuffer(string);
			buffer.reverse();
			rev=rev+buffer.toString()+" ";
			
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseeachword();
		
		String given = "Sathya is a Monster";
		String rev = "";
		String[] word= given.split(" ");
		
		for(int s=word.length-1; s>=0; s--) {
			
			rev = rev+word[s]+ " ";
			
		}
		System.out.println(rev);

	}

}
