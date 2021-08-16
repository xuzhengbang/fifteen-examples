package com.github.xuzhengbang.util;

import java.util.List;
import java.util.StringJoiner;

import org.junit.Test;

import com.google.common.collect.Lists;


/**
 * {@link com.github.xuzhengbang.util.StringUtilsTest#joinTest()}
 * 
 * {@link com.github.xuzhengbang.util.StringTest#joinTest()}
 */
public class StringJoinerTest {

	@Test
	public void add1Test() {
		List<Integer> list = Lists.newArrayList(1, 2, 3);
		StringJoiner sj = new StringJoiner(",", "(", ")");
		for (Integer integer : list) {
			sj.add(integer.toString());
		}
		System.out.println(sj);
	}

	@Test
	public void add2test() {
		StringJoiner sj = new StringJoiner(",");
		sj.add("一").add("二").add("三");
		System.out.println(sj);
	}

	@Test
	public void merge1test() {
		StringJoiner sj1 = new StringJoiner(",");
		sj1.add("一").add("二").add("三");
		StringJoiner sj2 = new StringJoiner("-", "[", "]");
		sj2.add("a").add("b").add("c");

		StringJoiner merge = sj1.merge(sj2);
		System.out.println(sj1);
		System.out.println(merge);
	}

	@Test
	public void merge2test() {
		StringJoiner sj1 = new StringJoiner(",");
		sj1.add("一").add("二").add("三");
		StringJoiner sj2 = new StringJoiner("-", "[", "]");
		sj2.add("a").add("b").add("c");

		StringJoiner merge = sj2.merge(sj1);
		System.out.println(sj2);
		System.out.println(merge);
	}
}
