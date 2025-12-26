package com.tnsif.interfacedemo;
interface name{
	void show();
}

public class InterfaceDemo implements name {
	public void show(){
		System.out.println("Hello My Name IS MANIKANDAN");
	}
public static void main(String args[])	{
	InterfaceDemo i=new InterfaceDemo();
	i.show();
	}
}
