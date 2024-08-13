package ReverseString;

public class ReverseString {

	
	
	public void onemoreway() {
		String given = "I will do it";
		String rev = "";
		char ch;
		
       for(int s=given.length()-1 ; s>=0; s--) {
			
			ch = given.charAt(s);
			rev= rev+ch;
		}
		
		System.out.println(rev);

	}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString reverse = new ReverseString();
		reverse.onemoreway();
		
		String given = "I will do it";
		String rev = "";
		char ch;
		for(int s=0 ; s<given.length(); s++) {
			
			ch = given.charAt(s);
			rev= ch + rev;
		}
		
		System.out.println(rev);

	}

}
