package com.tnsif.interfacedemo;
public class FuntionalInterface {
	

		public static void main(String[] args) {
		
		
			GreetingDemo gd = () -> 
			System.out.println("Hello Everyone, Welcome to the Java Session");
			
			gd.greet();
			
			

		}

	}



