package com.gmail.ivanjermakov1.wordcompletion.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
	
	public static Stream<String> stream(String string) {
		return Arrays.stream(string.split("(?!^)"));
	}
	
	public static List<String> sortByLength(Set<String> set) {
		return set.stream().sorted((Comparator.comparingInt(String::length))).collect(Collectors.toList());
	}
	
}
