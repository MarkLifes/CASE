package com.boxiao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main3 {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static boolean map(boolean flag) {
		return flag;


    }
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
    
        boolean flag;
        int temp = Integer.parseInt(in.nextLine().trim());
        flag = (temp != 0);
  
        res = map(flag);
        System.out.println(String.valueOf(res ? 1 : 0));  
    }
}
