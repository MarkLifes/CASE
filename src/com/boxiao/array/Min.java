package com.boxiao.array;

import java.util.Arrays;
import java.util.Collections;

public class Min {
	public static void main(String[] args) {
		Integer[] numbers = {8,6,9,12,35};
		int min = (int)Collections.min(Arrays.asList(numbers));
		int max = (int)Collections.max(Arrays.asList(numbers));
		System.out.println("���ֵ�� "+max);
		System.out.println("��Сֵ �� "+min);
	}
}
