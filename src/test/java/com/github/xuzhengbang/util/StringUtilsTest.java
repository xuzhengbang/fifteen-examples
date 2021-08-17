package com.github.xuzhengbang.util;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * 
 * @author Xv
 *
 */
public class StringUtilsTest {
	
	
	/**
	 * {@link com.github.xuzhengbang.util.StringJoinerTest#merge1test()}
	 * 
	 * {@link com.github.xuzhengbang.util.StringJoinerTest#merge2test()}
	 * 
	 * {@link com.github.xuzhengbang.util.StringTest#joinTest()}
	 */
	@Test
	public void joinTest() {
		String[] array = {"1", "2", "3"};
		System.out.println("-join1-");
		String join1 = StringUtils.join(array);
		System.out.println(join1);
		
		System.out.println("\n-join2-");
		String join2 = StringUtils.join(array, "#");
		System.out.println(join2);
		
		List<Integer> arrayList = Lists.newArrayList(1, 2, 3);
		System.out.println("\n-join3-");
		// 可变参, 无分隔符
		// 此时集合仅为一个元素
		String join3 = StringUtils.join(arrayList);
		System.out.println(join3);
		System.out.println("\n-join4-");
		// 将集合内元素以指定分割符进行连接
		String join4 = StringUtils.join(arrayList, ",");
		System.out.println(join4);
		
	}
	
	
	/**
	 * {@link com.github.xuzhengbang.util.StringTest.replaceTest()}
	 */
	@Test
	public void replaceTest() {
		ConsoleUtils.println("StringUtils.replaceChars(\"123456\", \"222\", \"abc\")", StringUtils.replaceChars("123456", "222", "abc"));
		ConsoleUtils.println("StringUtils.replace(\"123456\", \"222\", \"abc\")", StringUtils.replace("123456", "222", "abc"));
		ConsoleUtils.println("StringUtils.replace(\"12223456\", \"222\", \"abc\")", StringUtils.replace("12223456", "222", "abc"));
	}
	
	
	@Test
	public void repeat() {
		// 字符串重复N次
		System.out.println(StringUtils.repeat("*", 3));
		// 字符串重复N次, 并添加分隔符
		System.out.println(StringUtils.repeat("*", "-", 3));
	}

	@Test
	public void equalsAny() {
		// 字符串eq判断
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
		// 空值验证
		String[] array = { null, "", " ", "123", "\r", "\n", "\t", "\f" };
		for (int i = 0; i < array.length; i++) {
			String string = array[i];
			System.out.println(i);
			System.out.println("isBlank - " + StringUtils.isBlank(string));
			System.out.println("isEmpty - " + StringUtils.isEmpty(string));
		}

	}

}
