package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
    
    public void infor() {
    	System.out.println(name+"(가격:"+price+"원)이"+count+"개 입고되었습니다");
    }
    
}
