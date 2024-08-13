package Array;

public class HowtoFindanElementPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int givenarray[]= {1,4,2,3,6};
		
		int tofind=4;
		
		for (int arrayvalues : givenarray) {
			
			if(arrayvalues==tofind) {
				
				System.out.println("It is Presented");
				break;
			}
			
			
			
		}

	}

}
