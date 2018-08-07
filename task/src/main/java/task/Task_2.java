package task;

import static org.junit.Assert.assertEquals;

public class Task_2 {

	public static String capitalizeFirstLetters(String s) {
		/*
		 * Please implement this method to capitalize all first letters of the
		 * words in the given String. All other symbols shall remain intact. If
		 * a word does not start with a letter, it shall remain intact also.
		 * Assume that the parameter String can only contain spaces and
		 * alphanumeric characters.
		 *
		 * NOTE: please keep in mind that the words can be divided by single or
		 * multiple spaces. The spaces also can be found at the beginning or the
		 * end of the parameter string, and you need to preserve them.
		 *
		 * Please add a main method which evaluates and displays one or more
		 * test cases.
		 */
		boolean sp_reset=false;
		String res="";
		for(int i=0; i< s.length();i++) {
			if(s.charAt(i)==' ') sp_reset=true;
			//System.out.println("Character :"+s.charAt(i));
			if (sp_reset == true && (s.charAt(i) >= 'a' &&  s.charAt(i) <= 'z') )
			{
				//System.out.println("End 2 :"+s.substring(i, i+1).toUpperCase());
				res = res+s.substring(i, i+1).toUpperCase();
				sp_reset=false;
			}
			else res = res+s.charAt(i);
		}
		System.out.println("String :"+res);
		return res;

	}

	// For testing
	public static void main(String[] args) {
		String s = "This is a  test ???string";
		String ex = "This Is A  Test ???String";
		String res = Task_2.capitalizeFirstLetters(s);

		assertEquals(ex, res);
		System.out.println("Test Case Passed :"+res);
		
	}

}