package com.boxiao.method;

public class Enum {
	public static void main(String[] args) {
		System.out.println("���������ļ۸� ");
		for(Car c : Car.values()) {
			System.out.println(c + " ��Ҫ "
					+c.getPrice()+" ǧ��Ԫ");
		}
	}
}
