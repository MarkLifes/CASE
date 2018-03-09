package com.boxiao.method;

public class Overloading {
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest("test: ",10,20);
		vaTest(true,false,false);
	}

	private static void vaTest(boolean... b) {
		// TODO Auto-generated method stub
		System.out.println("vaTest(boolean...)"+
		" ���������� "+b.length+" ���ݣ� ");
		for(boolean bl:b) {
			System.out.print(bl+" ");
		}
		System.out.println();
	}

	private static void vaTest(String msg,int... no) {
		// TODO Auto-generated method stub
		System.out.println("vaTest(String,int ...): "+
		msg+" ���������� "+no.length+" ���ݣ� ");
		for(int n:no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	private static void vaTest(int...no) {
		// TODO Auto-generated method stub
		System.out.println("vaTest(int...): "
				+"���������� "+no.length+ " ���� �� ");
		for(int n:no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
