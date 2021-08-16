package com.github.xuzhengbang.util;

import java.util.StringJoiner;

public class ConsoleUtils {

	public static void println(String prefix, Object object) {
		StringJoiner stringJoiner = new StringJoiner(" - ");
		stringJoiner.add(prefix);
		stringJoiner.add(String.valueOf(object));
		System.out.println(stringJoiner);
	}
}
