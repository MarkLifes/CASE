package com.boxiao.timer;

import java.util.Calendar;

public class getYear {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH)+1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("��ǰʱ�䣺 "+cal.getTime());
		System.out.println("���ڣ�"+day);
		System.out.println("�·ݣ�"+month);
		System.out.println("��ݣ� "+year);
		System.out.println("һ�ܵĵڼ��죺 "+dow);
		System.out.println("һ�µĵڼ���: "+dom);
		System.out.println("һ��ĵڼ��죺 "+doy);
	}
}
