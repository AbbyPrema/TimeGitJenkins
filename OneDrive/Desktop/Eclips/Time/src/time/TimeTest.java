package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {
	//--------Test total seconds-------------------------------------------------------------
	@Test
	public void testGetTotalSecondsGood() {
	int seconds=Time.getTotalSeconds("05:05:05:00");
	assertTrue("The seconds were not calculated properly",seconds==18305);
	}
	
	@Test
	public void testGetTotalSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalSeconds("10:00");});
	}
		
	@Test
    public void testGetTotalSecondsBoundry() {
    int seconds = Time.getTotalSeconds("23:59:59:00");
    assertTrue("23:59:59 should have 86399 seconds",seconds==86399);
    }
	//---------Test Seconds----------------------------------------------------
	@Test
	public void testGetSecondsGood() {		
	int seconds=Time.getSeconds("00:00:01:00");
	assertTrue("The seconds were not calculated properly",seconds==1);
	}
	
	@Test
	public void testGetSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getSeconds("10:00");});
	}
		
	@Test
    public void testGetSecondBoundry() {
    int seconds = Time.getSeconds("23:59:59:00");
    assertTrue("00.00.59 should have 59 seconds",seconds==59);    }
	
//----------Test min----------------------------------------------------------------------		
	
	public void testGetTotalMinutesGood() {
	int seconds=Time.getTotalMinutes("00:05:00:00");
	assertTrue("The seconds were not calculated properly",seconds==300);
	}
	
	@Test
	public void testGetMinutesBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getSeconds("10:00");});
	}
	
	@Test
	public void testGetSecondsBoundary() {
	int seconds = Time.getSeconds("00:59:00:00");
	assertTrue("00:59:00 should have 3540 seconds",seconds==00);
	}
//----------Test hours--------------------------------------------------------------------
	@Test
	public void testTotalGetHoursGood() {
	int seconds=Time.getTotalHours("01:00:00:00");
	assertTrue("The seconds were not calculated properly",seconds==1);
			}
	
	@Test
	public void testGetHoursBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getSeconds("10:00");});
	}
	
	@Test
	public void testGetHoursBoundary() {
	int seconds = Time.getTotalHours("01:00:00");
	assertTrue("01:00:00 should have 3600 seconds",seconds==1);
	}
	
//---------Test Millisec----------------------------------------------------------------------
	@Test
	public void testGetMilliSecondsGood() {		
	int seconds=Time.getMilliSeconds("12:05:05:05");
	assertTrue("The milliSeconds were not calculated properly",seconds==5);
	}
	@Test
	public void testGetGetMilliSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getSeconds("10:00");});
	}
	
	@Test
	public void testGetMilliSecondBoundary() {
	int seconds = Time.getMilliSeconds("12:05:05:05");
	assertTrue("12:05:05:05 ",seconds==5);
	}
	
	
	}

