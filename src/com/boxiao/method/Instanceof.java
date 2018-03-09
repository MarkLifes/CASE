package com.boxiao.method;

import java.util.ArrayList;
import java.util.Vector;

import com.boxiao.map.Map;

public class Instanceof {
	public static void main(String[] args) {
		Object testObject = new Map();
		displayObjectClass(testObject);
	}

	private static void displayObjectClass(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Vector)
			System.out.println("������ java.util.Vector ���ʵ��");
		else if(o instanceof ArrayList)
			System.out.println("������ java.util.ArrayList ���ʵ��");
		else
			System.out.println("������ "+ o.getClass()+" ���ʵ��");
	}
}
