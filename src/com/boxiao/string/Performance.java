package com.boxiao.string;

public class Performance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<50000;i++)
		{
			String s1 = "Hello";
			String s2 = "Hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ��String �ؼ��ʴ����ַ���"
				+":"+(endTime-startTime)
				+" ����");
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String s3 = new String("Hello");
			String s4 = new String("Hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ͨ��String���󴴽��ַ���"
				+":"+(endTime1-startTime1)
				+" ����");
	}
}
