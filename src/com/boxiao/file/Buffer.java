package com.boxiao.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Buffer {
	public static void main(String[] args) throws Exception{
		File temp =File.createTempFile("test", ".txt",new File("E:\\CODE\\Eclipse\\CASE"));
		System.out.println("�ļ�·���� "+temp.getAbsolutePath());
		temp.deleteOnExit();
		BufferedWriter out =new BufferedWriter(new FileWriter(temp));
		out.write("������ʯ��");
		System.out.println("��ʱ�ļ��Դ���");
		out.close();
	}
}
