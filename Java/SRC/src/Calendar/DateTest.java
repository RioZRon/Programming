package Calendar;

import java.util.*;
import java.util.GregorianCalendar;

/**
 * Created by riosysm on 2017/10/21.
 */
public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(now.getDate());
        System.out.println(new GregorianCalendar().get(Calendar.DAY_OF_MONTH));
        
    }
}
