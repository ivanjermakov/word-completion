package com.gmail.ivanjermakov1.wordcompletion.util;

import java.util.Set;
import java.util.stream.Collectors;

public class Sets {
	
	public static Set<String> containing(Set<String> words, String input) {
		return words.stream()
				.filter(w -> w.indexOf(input) == 0)
				.collect(Collectors.toSet());
	}
	
}
