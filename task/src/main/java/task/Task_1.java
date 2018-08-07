package task;

import static org.junit.Assert.assertEquals;

import java.lang.Math;

public class Task_1 {

    public static int getClosestToZero(int[] a)  {
    /*
    Please implement this method to
	return the number in the array that is closest to zero.
	If there are two equally far from zero elements like 2 and -2,
	consider the positive element to be "closest" to zero.

	Please add a main method which evaluates and displays one or more test cases.
	*/
    	int  ans=a[0] ;
     	for(int i = 0 ; i< a.length; i++)
    	{
    		if( Math.abs(a[i]-0) == Math.abs(ans)) 
			{
				ans = Math.abs(a[i]);
				//System.out.println("Positive is : " + ans);
			}
    		if ( Math.abs(a[i]-0) < Math.abs(ans)) ans = a[i];
    	}
		return ans;

    }

    public static void main(String[] args) {
    	int[] numbers = {4, 5, 3, 3, -2, 6, 7, 9, 3,  -10};
    	int ans = getClosestToZero(numbers);
    	System.out.println("Ans : " + ans);
    	assertEquals(-2, ans);
		System.out.println("---------------Test Case Passed 1:");
    	
    	int[] numbers1 = {4, 5, 3, 3, -2, 6, 7, 9, 2,  -10};
    	int ans1 = getClosestToZero(numbers1);
    	System.out.println("Ans : " + ans1);
    	assertEquals(2, ans1);
		System.out.println("---------------Test Case Passed 2:");
    }
    
}