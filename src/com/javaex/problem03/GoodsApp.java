package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.problem02.Friend;

public class GoodsApp {

    public static void main(String[] args) {
    	ArrayList<Goods> FLA = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		System.out.println("상품을 3개 입력 해 주세요");
		Integer i01=0;
		Integer i02=0;
		for (int i=0; i < 9; i++) {
			String str0 = sc.next();
			str.add(str0);
		}
		
		for(int i=0;i<3;i++) {
		FLA.add(new Goods(str.get(i+i+i),i01.parseInt(str.get(i+i+i+1)),i02.parseInt(str.get(i+i+i+2))));
		FLA.get(i).infor();
		}
    }

}
