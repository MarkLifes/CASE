package com.boxiao.file;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			if(file.delete()) {
				System.out.println(file.getName()+" �ļ��ѱ�ɾ����");
			}else {
				System.out.println("�ļ�ɾ��ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
