package com.atguigu.struts2.helloworld;

import java.text.DecimalFormat;

public class TestFormat {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("######0.00");
		double d = 100;
		System.out.println(df.format(d));
	}
}
