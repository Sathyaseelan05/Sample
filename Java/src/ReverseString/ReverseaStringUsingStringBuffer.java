package ReverseString;

public class ReverseaStringUsingStringBuffer {
	
	
	public static void reverseword() {
		
		String given = "Welcome to TamilNadu";
		String rev="";
		String[] time = given.split(" ");
		
		for (String string : time) {
			StringBuffer buffer = new StringBuffer(string);
			buffer.reverse();
			rev=rev+buffer.toString();
			
		}
		System.out.println(rev);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseword();
		
		
		String given = "Welcome to TamilNadu";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());

	}

}
