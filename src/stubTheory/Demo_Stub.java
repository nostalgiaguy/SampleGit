package stubTheory;

import org.junit.Assert;
import org.junit.Test;



class DayOrDark{
	
	public static String getDayDarkInfo(){
		/*
		 * Think and write how to find its day or dark.
		 */
		return "night";
		
	}
}
public class Demo_Stub {
	
	
	@Test
	public void testDayOrDark(){
		Assert.assertEquals("night",DayOrDark.getDayDarkInfo());
	}
	
}