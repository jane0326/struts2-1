package com.atguigu.struts2.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil{
	    /**  
	     * 计算两个日期之间相差的天数  
	     * @param smdate 较小的时间 
	     * @param bdate  较大的时间 
	     * @return 相差天数 
	     * @throws ParseException  
	     */    
	    public static int daysBetween(Date smdate,Date bdate) throws ParseException    
	    {    
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        smdate=sdf.parse(sdf.format(smdate));  
	        bdate=sdf.parse(sdf.format(bdate));  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate);    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));           
	    }  
	    /*
	     *获取下个月的月份
	     *@param Date date 当月的月份
	     *@return  下月的月份
	     * */
	    public static Date getNextDate(Date date) {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.MONTH, 1);
	        return cal.getTime();
	    }
	
	    /*
	     *获取上个月的月份
	     *@param Date date 当月的月份
	     *@return  上月的月份
	     * */
	    public  static Date getLastDate(Date date) {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.MONTH, -1);
	        return cal.getTime();
	    }
	
	    /**
	     * 获取往前11个月的月份
	     * @param date
	     * @return
	     */
	    public  static Date getElevthDate(Date date) {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        cal.add(Calendar.MONTH, -11);
	        return cal.getTime();
	    }
}
