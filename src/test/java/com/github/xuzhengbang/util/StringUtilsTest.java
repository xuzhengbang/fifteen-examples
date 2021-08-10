package com.github.xuzhengbang.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 
 * @author Xv
 *
 */
public class StringUtilsTest {
	

	@Test
	public void equalsAny() {
		String[] array = { "1", "2", "3"};
		System.out.println(StringUtils.equalsAny("0", array));
		System.out.println(StringUtils.equalsAny("1", array));
	}
	
	@Test
	public void leftPad() { 
		System.out.println(StringUtils.leftPad("1", 5, "0"));
		// %0nd中的0是占位符（不写时会以空格补足），n是位数，d代表数字类型；
		System.out.println(String.format("%05d", 1));
	}

	@Test
	public void blankOrEmptyTest() {
		String[] array = { null, "", " ", "123", "\r", "\n", "\t", "\f" };
		for (int i = 0; i < array.length; i++) {
			String string = array[i];
			System.out.println(i);
			System.out.println("isBlank - " + StringUtils.isBlank(string));
			System.out.println("isEmpty - " + StringUtils.isEmpty(string));
		}

	}

}
