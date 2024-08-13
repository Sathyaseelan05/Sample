package ReverseNumberAndPalindrome;

public class ReverseNumber {
	
	public static void numberReverseusingLogic() {
		
		int num = 675888754;
		int rev=0;
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num=num/10;
			
		}
			System.out.println(rev);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberReverseusingLogic();

		int num = 123456;
		StringBuffer buffer= new StringBuffer();
		buffer.append(num);
		System.out.println("value is :" + buffer.reverse());
		
		
	}

}
