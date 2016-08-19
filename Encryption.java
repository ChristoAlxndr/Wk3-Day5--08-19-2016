package com.project;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) throws Exception {

		EncryptMethods eM = new EncryptMethods();
		EncryptValidators eV = new EncryptValidators();

		Scanner scan = new Scanner(System.in);

		String userInput = null;
		String pass = null;
		boolean userName = true;
		boolean password = true;

		do {
			System.out.println("Username");
			userInput = scan.nextLine();

			if (userInput.equalsIgnoreCase("ssacto")) {
				userName = false;
				System.out.println("Username accepted \n\n"
						+ "Please enter password \n");
			} else {
				System.out.println("Invalid Username. Please try again. \n");
			}

			do {
				userInput = scan.nextLine();

				if (userInput.equals("UsaUsaUsa")) {
					password = false;
					System.out.println("Password accepted. \n\n");
				} else {
					userName = true;
					System.out.println("Invalid password. Please try again. \n");
					break;
				}
			} while (password);

		} while (userName);
		System.out.println("Welcome to the eNcRyPtOr");

		eM.encryptor();

	}
}