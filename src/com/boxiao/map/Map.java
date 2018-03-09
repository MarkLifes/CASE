package com.boxiao.map;

import java.util.*;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("xiaobo","bad" );
		map.put("wuge", "pig");
		map.put("liu", "wang");
		
		//����һ ��ͨʹ�� ����ȡֵ
		System.out.println("Map.keyset������");
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
		//������ 
		System.out.println("Map.enterSet����iterator������");
		Iterator<Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,String> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//������ �Ƽ� ������ʱ������
		System.out.println("Map.enterSet����: ");
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//������ ֻ�ܱ���value
		System.out.println("Map.values������");
		for(String a : map.values()) {
			System.out.println(a);
		}
	}
}
