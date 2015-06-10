package com.rahulworks;

public class myFirstTestWorld {

	public static void main(String[] args) {
		System.out.println("Simple Sample = " + args[0]);

		for (int i=0;i<args.length;i++){
			System.out.println("He said = ************* " + args[i] + " *******************");
			}
		
		if (args[0].equals("IE")){
			System.out.println("Got it");
		}
	}

}
