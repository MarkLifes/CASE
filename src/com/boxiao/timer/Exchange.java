package com.boxiao.timer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exchange {
	public static void main(String[] args) {
		Long timp = System.currentTimeMillis(); //��ȡ��ǰʱ���
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timp))));
		System.out.println(sd);
	}
}
