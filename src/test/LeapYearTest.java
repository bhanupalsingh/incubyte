package test;


import junit.framework.TestCase;


import com.leapyear.LeapYear;

public class LeapYearTest extends TestCase {

	LeapYear leapyear = new LeapYear();

	public void test() {
		assertEquals(leapyear.checkLeapYear(12) ,  true);
		assertEquals(leapyear.checkLeapYear(1600) ,  true);
		assertEquals(leapyear.checkLeapYear(2000) ,  true);
		assertEquals(leapyear.checkLeapYear(2001) ,  false);
		assertEquals(leapyear.checkLeapYear(2004) ,  true);
		assertEquals(leapyear.checkLeapYear(10000) ,  true);
	}

	
}