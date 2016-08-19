package com.project;

import java.util.Scanner;

public class EncryptValidators {
	
	public void validation() {
	
	Scanner scan = new Scanner(System.in);
	EncryptMethods eM = new EncryptMethods();
	
	String userInput = null;
	boolean continueProgram = true;
	
		System.out.println("Please enter 'encrypt' or 'decrypt' to continue. Enter 'exit' to close the program. \n");
		userInput = scan.nextLine();
		
		do {
		switch (userInput.toLowerCase()) {
			case "encrypt":
			eM.encryptor();
			break;
			
			case "decrypt":
			eM.decryptor();
			break;
			
			case "exit":
			knockOff(userInput);
			
			default:
			System.out.println("Please enter 'encrypt' or 'decrypt' to continue. Enter 'exit' to close the program. \n");
			break;
			
			}
		} while (continueProgram = true);
	}
	
	public boolean knockOff (String userInput) {
		System.out.println("Mischiff managed. \n\n");
		System.exit(0);
		return false;
	}
	
}