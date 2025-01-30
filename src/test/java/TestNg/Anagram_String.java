package TestNg;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
	
		String s1= "care";
		String s2="race";
		
		//first we check lenght 
		
		if(s1.length()==s2.length()) {
			
			//convert string to char array
			
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean result=Arrays.equals(c1, c2);
			
			if(result) {
				System.out.println("Anagram number");
			}
				
				else {
					System.out.println("not anagram number");
				}
			}
		}
				

	}


