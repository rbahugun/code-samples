package task;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_4 {

	
    static class TimeRange{
    /*
	 * Design a class that will represent a time range: start time to end time
	 * One possible use for such a class is in scheduling or booking application.
	 * Example: Conference room will be used from Monday 10am to 12pm
	 * Create any code constructors, variables and methods that you feel are necessary.
	 * One such method should test for intersection or conflict
	 * in times between 2 instances of TimeRange
	 *
	*/
    	private Date startTime;
    	private Date endTime;
    	
    	public TimeRange(Date startTime, Date endTime) throws ParseException {
            this.startTime = startTime;
            this.endTime = endTime;
    	}

    	private static boolean IsConflict( TimeRange tr1, TimeRange tr2) {
	            if (tr2.endTime.before(tr1.startTime)
	            		|| (tr2.startTime.after(tr1.endTime) ) ) {
	    	        System.out.println("Time Range has no conflict with other");
					return false;
	    	    }
    	        System.out.println("Time Range has conflict ");
				return true;
	
	        }
    	}

    public static void main(String[] args) throws ParseException {
    	TimeRange tr1 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 01:00"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 04:00"));
    	TimeRange tr2 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 03:00"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 04:00"));

    	boolean ans = Task_4.TimeRange.IsConflict(tr1, tr2);
    	System.out.println("Ans : " + ans);
    	assertEquals(true, ans);
		System.out.println("-------------------Test Case 1 Passed :");

    	tr1 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 01:00"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 02:00"));
    	tr2 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 02:01"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 03:00"));
    	ans = Task_4.TimeRange.IsConflict(tr1, tr2);
    	System.out.println("Ans : " + ans);
    	assertEquals(false, ans);
		System.out.println("--------------------Test Case 2 Passed :");
		
    	tr1 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 01:01"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 02:00"));
    	tr2 = new TimeRange(new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 12:01"), 
    			new SimpleDateFormat ("dd-MM-yyyy hh:mm").parse("22-06-2018 01:00"));
    	ans = Task_4.TimeRange.IsConflict(tr1, tr2);
    	System.out.println("Ans : " + ans);
    	assertEquals(false, ans);
		System.out.println("--------------------Test Case 3 Passed :");
		
    }


}
