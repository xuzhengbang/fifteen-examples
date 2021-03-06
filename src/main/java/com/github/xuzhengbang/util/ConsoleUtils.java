package com.github.xuzhengbang.util;

import java.util.StringJoiner;

public class ConsoleUtils {

	public static void println(String prefix, Object object) {
		StringJoiner stringJoiner = new StringJoiner(" -> ");
		stringJoiner.add(prefix);
		stringJoiner.add(String.valueOf(object));
		System.out.println(stringJoiner);
	}
	
	public static void println(String prefix, Object...objects) {
		StringJoiner stringJoiner = new StringJoiner(" -> ");
		stringJoiner.add(prefix);
		for (Object object : objects) {
			stringJoiner.add(String.valueOf(object));
		}
		System.out.println(stringJoiner);
	}
}
