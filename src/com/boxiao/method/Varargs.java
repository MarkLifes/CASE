package com.boxiao.method;

public class Varargs {
	public static void main(String[] args) {
		int sum = 0;
		sum = sumVarargs(new int[] {10,12,33});
		System.out.println("�������֮��Ϊ�� "+sum);
	}

	private static int sumVarargs(int... is) {
		// TODO Auto-generated method stub
		int sum,i;
		sum = 0;
		for(int a:is) {
			sum+=a;
		}
		return sum;
	}
}
