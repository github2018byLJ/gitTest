package com.yd.tse.test;

import java.math.BigDecimal;
import java.util.Scanner;
public class Test001 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String str1 = sc.next();
//        
//        
//        
//        double d = Double.valueOf(str);
//        int i = Integer.valueOf(str1);
//        
//        
//        
//        Double ret = Math.pow(d, i);
//        System.out.println(ret);
//        String str2=new BigDecimal(ret.toString()).toString();
//        
//        System.out.println(str2);
//    }
	
	public static void main(String[] args) {
//		Double num=8.2347983984297E7;
		Double num=5.4881562051773216E23;
		String str=new BigDecimal(num.toString()).toString();
		System.out.println(str);
	}
}

