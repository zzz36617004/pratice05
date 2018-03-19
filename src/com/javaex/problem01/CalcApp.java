package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    
    	
    	Integer i01=0;
    	Integer i02=0;
    	String a;
    	boolean esc= true;
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    	System.out.print(">>");
    	a=sc.nextLine();
   
    	String b[]=a.split(" ");
    	
    	if(b[0].equals("/q")) {
    		System.out.println("종료합니다.");
    		break;
    		
    	}
    	int c=i01.parseInt(b[0]);
    	int d=i02.parseInt(b[2]);
    
    	
    	if(b[1].equals("+")) {
    	Add add=new Add(); 
    	add.setValue(c,d);
    	System.out.println(">> "+add.calcuate());
    	}
    	else if(b[1].equals("-")){
    		Sub sub=new Sub();
    		sub.setValue(c,d);
    		System.out.println(">> "+sub.calcuate());
    	}
    	else if(b[1].equals("*")){
    		Mul mul=new Mul();
    		mul.setValue(c,d);
    		System.out.println(">> "+mul.calcuate());
    	}
    	else if(b[1].equals("/")){
    		Div div=new Div();
    		div.setValue(c,d);
    		System.out.println(">> "+div.calcuate());
    	}
    	else{
    		System.out.println("알 수 없는 연산자입니다.");
    	}
    	
    	}
    	sc.close();
    }
    
}


