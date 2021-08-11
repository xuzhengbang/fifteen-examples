package com.github.xuzhengbang.util;

import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArraySorterTest {
	
	/**
	 * 发现出处
	 * {@link org.apache.commons.lang3.ArrayUtils#removeAll(Object, int...)}
	 * 底层逻辑
	 * {@link com.github.xuzhengbang.util.ArraysTest#sort()}}
	 */
	@Test
	public void sortTest() {
		Integer[] array = { 1, 3, 5, 2, 4 };
		Integer[] sort = ArraySorter.sort(array);
		System.out.println(ArrayUtils.toString(sort));
		// 原始数据被修改
		System.out.println(ArrayUtils.toString(array));
	}
}
