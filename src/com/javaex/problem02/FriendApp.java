package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		ArrayList<Friend> FLA = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		System.out.println("친구를 3명 등록해 주세요");

		for (int i=0; i < 9; i++) {
			String str0 = sc.next();
			str.add(str0);
		}
		for (int i=0; i < 3; i++) {
			FLA.add(new Friend());
				FLA.get(i).setName(str.get(i+i+i));
				FLA.get(i).setHp(str.get(i+i+i+1));
				FLA.get(i).setSchool(str.get(i+i+i+2));
			
		}
		for (int i=0 ; i < 3; i++) {
			FLA.get(i).showInfo();
		}
		sc.close();
	}
}
