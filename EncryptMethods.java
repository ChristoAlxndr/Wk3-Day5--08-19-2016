package com.project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptMethods {

	EncryptValidators eV = new EncryptValidators();
	
	public String encryptor() {
		Scanner scan = new Scanner(System.in);

		String userInput = null;
		int arrayLength = 0;
		char[] alphaArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] cipherArray = { 'r', 's', 't', 'l', 'n', 'e', 'q', 'y', 'w', 'u', 'i', 'o', 'p', 'z', 'x', 'c', 'v', 'b', 'm', 'a', 'd', 'f', 'g', 'h', 'j', 'k' };
		ArrayList<Character> messageToCipher = new ArrayList<>();
		ArrayList<Character> encryption = new ArrayList<>();

		System.out.println("Please enter a word or phrase to encrypt.");
		userInput = scan.nextLine();
		arrayLength = userInput.length();
		
		for (int i = 0; i < arrayLength; i++) {
			char someChar = userInput.charAt(i);
			messageToCipher.add(someChar);
			}

		for (int i = 0; i < messageToCipher.size(); i++) {
			char compare = messageToCipher.get(i);

			for (int j = 0; j < cipherArray.length;j++) {
				
				if (compare == alphaArray[j]) {
					encryption.add(cipherArray[j]);
				}
			}
		}
		System.out.println(encryption + "\n");
		eV.validation();
		return null;
	}
	
	
	public String decryptor() {
		Scanner scan = new Scanner(System.in);
		
		String userInput = null;
		int arrayLength = 0;
		char[] alphaArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
		char[] cipherArray = { 'r', 's', 't', 'l', 'n', 'e', 'q', 'y', 'w', 'u', 'i', 'o', 'p', 'z', 'x', 'c', 'v', 'b', 'm', 'a', 'd', 'f', 'g', 'h', 'j', 'k', ' ' };
		ArrayList<Character> messageToDecode = new ArrayList<>();
		ArrayList<Character> decryption = new ArrayList<>();
		
		System.out.println("Please enter an encrypted word or phrase to decrypt.");
		userInput = scan.nextLine();
		arrayLength = userInput.length();
		
		for (int i = 0; i < arrayLength; i++) {
			char someChar = userInput.charAt(i);
			messageToDecode.add(someChar);
		}
		
		for (int i = 0; i <messageToDecode.size(); i++) {
			char compare = messageToDecode.get(i);
			
			for (int j = 0; j < alphaArray.length; j++) {
				if (compare == cipherArray[j]) {
					decryption.add(alphaArray[j]);
				}
			}
		}
		System.out.println(decryption + "\n");
		eV.validation();
		return null;
	}
}
