package com.boxiao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static String[] groupList(String[] str) {
		return str;
    	
    }
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] res;
            
        int strsize = 0;
        strsize = Integer.parseInt(in.nextLine().trim());
        String[] str = new String[strsize];
        String stritem;
        for(int i = 0; i < strsize; i++) {
            try {
                stritem = in.nextLine();
            } catch (Exception e) {
                stritem = null;
            }
            str[i] = stritem;
        }
  
        res = groupList(str);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
