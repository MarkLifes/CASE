package com.boxiao.array;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Bo");
		arraylist.add("Liu");
		arraylist.add("Yuan");
		arraylist.add("Yoo");
		System.out.println("��תǰ�� "+arraylist);
		Collections.reverse(arraylist);
		System.out.println("��ת�� "+arraylist);
	}
}
