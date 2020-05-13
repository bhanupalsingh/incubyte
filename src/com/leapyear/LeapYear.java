package com.leapyear;
public class LeapYear {
    
    public boolean checkLeapYear(int year) {
    	boolean leap = false;
    	if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
            }
            else
                leap = true;
        }
        

        return leap;
    }


}