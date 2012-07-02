package org.ow2.mindEd.adl.custom.util;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * <b>Class</b> <i>DateUtils</i>
 * <p>
 * This class provides current date.
 * 
 * @author proustr
 * @model kind="util"
 */
public class DateUtils {
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());

	}

}
