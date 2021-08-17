package com.github.xuzhengbang.util;

import org.junit.Test;

public class StringTest {

	/**
	 * {@link com.github.xuzhengbang.util.StringJoinerTest#merge1test()}
	 * 
	 * {@link com.github.xuzhengbang.util.StringJoinerTest#merge2test()}
	 * 
	 * {@link com.github.xuzhengbang.util.StringUtilsTest#joinTest()}
	 * 
	 */
	@Test
	public void joinTest() {
		String join = String.join("-", "A", "B", "C");
		System.out.println(join);
		// Console_>
		// A-B-C
	}

	/**
	 * 参考 https://blog.csdn.net/liupeifeng3514/article/details/80030360
	 */
	@Test
	public void replaceTest() {
		String replace = "ABC".replace("A", "D");
		System.out.println(replace);
		// Console_>
		// DBC
	}
}
