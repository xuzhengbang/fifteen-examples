package com.github.xuzhengbang.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArraysTest {
	
	@Test
	public void sort() {
		Integer[] array = { 1, 3, 5, 2, 4 };
		Arrays.sort(array);
		// 对原数组进行排序
		System.out.println(Arrays.deepToString(array));
	}
	
	
	/**
	 * 对Arrays.sort的封装
	 * {@link org.apache.commons.lang3.ArraySorter#sort(T[]) }
	 */
	@Test
	public void sortClone() {
		Integer[] array = { 1, 3, 5, 2, 4 };
		Integer[] clone = ArrayUtils.clone(array);
		Arrays.sort(clone);
		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.deepToString(clone));
	}

	@Test
	public void arrayIntTest() {
		// 基本类型是不支持泛型化
		// 基本类型数组整体作为一个对象变成了List的一个元素
		int[] array = { 1, 2, 3, 4, 5 };
		List<int[]> list = Arrays.asList(array);
		System.out.println(list.size());
	}

	@Test
	public void arrayIntegerTest() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		System.out.println(list.size());
	}

	@Test
	public void AsListOperation() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		System.out.println(list.size());
		// Arrays.asList()方法转换成的集合
		// add/remove/clear方法会抛出UnsupportedOperationException()
		list.add(6);
		// Arrays.asList()方法转换的List并不是真正的java.util.ArrayList
		// 返回的是java.util.Arrays.ArrayList
		// java.util.Arrays.ArrayList内没有实现add/remove/clear方法
	}

	@Test
	public void AsListOperation2() {
		// 解决Arrays.asList()生成的List无法操作的文件的问题
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
		arrayList.add(6);
		System.out.println(arrayList);
	}
}
