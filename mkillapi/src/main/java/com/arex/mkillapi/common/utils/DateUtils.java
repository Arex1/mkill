package com.arex.mkillapi.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/**
 * 描述：日期工具包，将日期进行格式化
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.common.utils
 * 2019/10/16
 */
public class DateUtils {

    private DateUtils(){

    }

    /**
     *
     * @param date
     * @param format
     * @return
     * @throws ParseException
     */
    public static String formatCSTTime(String date, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = sdf.parse(date);
        return DateUtils.getDateFormat(d, format);
    }

    /**
     *
     * @param date
     * @param dateFormatType
     * @return
     */
    private static String getDateFormat(Date date, String dateFormatType) {
        SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
        return simformat.format(date);
    }

    /**
     *
     * @param localDate
     * @param dateFormatType
     * @return
     */
    public static String getLocalDateFormat(LocalDate localDate, String dateFormatType) {
        SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
        return simformat.format(localDate);
    }

    /**
     *
     * @param localDateTime
     * @param dateFormatType
     * @return
     */
    public static String getLocalDateFormat(LocalDateTime localDateTime, String dateFormatType) {
        SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
        return simformat.format(localDateTime);
    }
}
