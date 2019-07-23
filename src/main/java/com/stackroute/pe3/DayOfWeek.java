package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {
    public String checkDayOfWeek(String date){
        String result = "";
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        result = df.format(c.getTime());
        c.add(Calendar.DATE, 6);
        result+="\n"+df.format(c.getTime());

        return result;
    }
}
