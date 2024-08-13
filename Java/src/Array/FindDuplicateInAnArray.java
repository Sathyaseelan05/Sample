package Array;

import java.util.TreeSet;



public class FindDuplicateInAnArray {

	
	
	public void java() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "abcdeeeefffff";
		char[] array = given.toCharArray();
		char tofind ='f';
		int count =0;
		
		
		for(char ch:array)	{
			
			if(ch==tofind) {
				
				count++;
				
			}
		}
		System.out.println(count);
		
		
	
		
		
		
				
		}

	}


