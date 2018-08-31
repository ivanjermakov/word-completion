package com.gmail.ivanjermakov1.wordcompletion;

import com.gmail.ivanjermakov1.wordcompletion.core.Dictionary;
import com.gmail.ivanjermakov1.wordcompletion.layout.Layout;
import com.gmail.ivanjermakov1.wordcompletion.util.Sets;
import com.gmail.ivanjermakov1.wordcompletion.util.Strings;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Completer {
	
	private Layout layout;
	private Dictionary dictionary;
	
	public Completer() {
	}
	
	public Layout getLayout() {
		return layout;
	}
	
	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	
	public Dictionary getDictionary() {
		return dictionary;
	}
	
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public List<String> complete(String input) {
		Set<String> suggestions = Sets.containing(dictionary.getContent(), input);
		return Strings.sortByLength(suggestions);
	}
	
	public List<String> complete(String input, int maxAmount) {
		return complete(input).stream()
				.limit(maxAmount)
				.collect(Collectors.toList());
	}
	
}
