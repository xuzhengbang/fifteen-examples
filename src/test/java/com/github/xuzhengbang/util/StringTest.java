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
	}
}
