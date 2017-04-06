package com.atguigu.struts2.helloworld;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
public class TestFormat {

	public static void main(String[] args) throws ParseException {
		DecimalFormat df = new DecimalFormat("######0.00");
		String date = "2017-02";
	   
		double dyk = 0.427602949762449;
	    double syk = 0.425525495780395;
		double dy = 0.4276;
		double sy = 0.4255;
	    System.out.println("dyk: "+dyk+"   "+"dy: "+dy);
	    System.out.println("syk: "+syk+"   "+"sy: "+sy);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");  
		 //当月月份
        Date d1 = sdf.parse(date);  
        //获取下月月份
        Date d2 = DateUtil.getNextDate(d1); 
       //计算当月天数 
        int day1 = DateUtil.daysBetween(d1,d2);
        System.out.println("当月天数：  "+day1);
        //获取上月月份
        Date d3 = DateUtil.getLastDate(d1);
        //计算上月天数
        int day2 = DateUtil.daysBetween(d3,d1);
        System.out.println("上月天数： "+day2);
        
//		double dypj = 0.0152715339200875;        
//		double sypj = 0.0137266288961418;
		double dypjk = dyk/day1;
		double sypjk = syk/day2;
		double dypj = dy/day1;
		double sypj = sy/day2;
		
	    System.out.println("dypjk: "+dypjk+"   "+"dypj: "+dypj);
	    System.out.println("sypjk: "+sypjk+"   "+"sypj: "+sypj);

		double resk = ((dypjk-sypjk)/Math.abs(sypjk)*100);
		double res = ((dypj-sypj)/Math.abs(sypj)*100);
		
		System.out.println("------kap:"+(dypjk-sypjk)/Math.abs(sypjk));		
		System.out.println("------oracle:"+(dypj-sypj)/Math.abs(sypj));

		
		String rjhbk = df.format(resk)+"%";
		String rjhb = df.format(res)+"%";
		System.out.println("rjhbk:  "+rjhbk+"    "+"rjhb: "+rjhb);        
		
		
		
	}
}
