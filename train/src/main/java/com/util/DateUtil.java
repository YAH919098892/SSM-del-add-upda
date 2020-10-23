package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

public Date getDate(String birth,String ges) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(ges);
    Date date= null;
    try {
        date = simpleDateFormat.parse(birth);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return date;
    }
}
