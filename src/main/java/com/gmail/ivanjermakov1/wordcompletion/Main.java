package com.gmail.ivanjermakov1.wordcompletion;

import com.gmail.ivanjermakov1.wordcompletion.core.Dictionary;
import com.gmail.ivanjermakov1.wordcompletion.layout.QwertyLayout;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static final String RESOURCES_FOLDER = "src/main/resources/";
	
	public static void main(String[] args) throws IOException {
		Completer completer = new Completer();
		completer.setLayout(new QwertyLayout());
		Dictionary dictionary = new Dictionary(RESOURCES_FOLDER + "dictionary.txt");
		dictionary.load();
		completer.setDictionary(dictionary);
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			List<String> suggestions = completer.complete(scanner.next(), 5);
			System.out.println(suggestions);
		}
	}
	
}
