package com.debug.demo.utils;
/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月13日 上午10:19:57
*/

import java.text.SimpleDateFormat;
public class DataUtils {
	public static void main(String[] args) {
		
	}
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");

	/*
	 * //获取一周前的时间 Calendarndar c = Calendar.getInstance();
	 * 
	 * c.add(Calendar.DATE, -7); long time = c.getTime().getTime(); String format =
	 * sdf.format(time); System.out.println(format);
	 * 
	 * 
	 * //获取一月前的时间 c.add(Calendar.MONTH,-1); Date time1 = c.getTime(); String format1
	 * = sdf.format(time1); System.out.println(format1);
	 * 
	 * //获取3月前的时间 c.add(Calendar.MONTH,-3); Date time2 = c.getTime(); String format2
	 * = sdf.format(time2); System.out.println(format2);
	 * 
	 * //获取一年前的时间 c.add(Calendar.YEAR,-1); Date time3 = c.getTime(); String format3
	 * = sdf.format(time3); System.out.println(format3);
	 */
}
