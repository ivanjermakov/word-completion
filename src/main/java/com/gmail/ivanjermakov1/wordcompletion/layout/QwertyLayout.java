package com.gmail.ivanjermakov1.wordcompletion.layout;

import java.util.*;

public class QwertyLayout implements Layout {
	
	@Override
	public Map<String, Set<String>> layout() {
		Map<String, Set<String>> keys = new HashMap<>();
		
		keys.put("q", new HashSet<>(Arrays.asList("wa".split("(?!^)"))));
		keys.put("w", new HashSet<>(Arrays.asList("qeasd".split("(?!^)"))));
		keys.put("e", new HashSet<>(Arrays.asList("wrsdf".split("(?!^)"))));
		keys.put("r", new HashSet<>(Arrays.asList("etdfg".split("(?!^)"))));
		keys.put("t", new HashSet<>(Arrays.asList("ryfgh".split("(?!^)"))));
		keys.put("y", new HashSet<>(Arrays.asList("tughj".split("(?!^)"))));
		keys.put("u", new HashSet<>(Arrays.asList("yihjk".split("(?!^)"))));
		keys.put("i", new HashSet<>(Arrays.asList("uojkl".split("(?!^)"))));
		keys.put("o", new HashSet<>(Arrays.asList("ipkl".split("(?!^)"))));
		keys.put("p", new HashSet<>(Arrays.asList("ol".split("(?!^)"))));
		
		keys.put("a", new HashSet<>(Arrays.asList("qwsxz".split("(?!^)"))));
		keys.put("s", new HashSet<>(Arrays.asList("wedcxzaq".split("(?!^)"))));
		keys.put("d", new HashSet<>(Arrays.asList("erfvcxsw".split("(?!^)"))));
		keys.put("f", new HashSet<>(Arrays.asList("rtgbvcde".split("(?!^)"))));
		keys.put("g", new HashSet<>(Arrays.asList("tyhnbvfr".split("(?!^)"))));
		keys.put("h", new HashSet<>(Arrays.asList("yujmnbgt".split("(?!^)"))));
		keys.put("j", new HashSet<>(Arrays.asList("uikmnhy".split("(?!^)"))));
		keys.put("k", new HashSet<>(Arrays.asList("iolmju".split("(?!^)"))));
		keys.put("l", new HashSet<>(Arrays.asList("opmki".split("(?!^)"))));
		
		keys.put("z", new HashSet<>(Arrays.asList("asx".split("(?!^)"))));
		keys.put("x", new HashSet<>(Arrays.asList("zsdc".split("(?!^)"))));
		keys.put("c", new HashSet<>(Arrays.asList("xdfv".split("(?!^)"))));
		keys.put("v", new HashSet<>(Arrays.asList("cfgb".split("(?!^)"))));
		keys.put("b", new HashSet<>(Arrays.asList("vghn".split("(?!^)"))));
		keys.put("n", new HashSet<>(Arrays.asList("bhjm".split("(?!^)"))));
		keys.put("m", new HashSet<>(Arrays.asList("njk".split("(?!^)"))));
		
		return keys;
	}
	
}
