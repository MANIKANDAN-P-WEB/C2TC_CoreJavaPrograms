package com.tnsif.nonaccessmodifiers;

public class Static {
	static int count;
	static {
		count=40;
		System.out.println("show static"+"count assignied:"+count);
	}
	static void show() {
		System.out.println("method run in static"+"with count of:"+count);
	}
	public static void main(String args[]) {
		System.out.println("static in main"+"method:"+count);
		show();
	}

}
