package com.github.xuzhengbang.util;

import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {

	/**
	 * 获取数组的第n个元素，如果索引超出范围或数组为null，则为null。
	 */
	@Test
	public void getTest() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer integer = ArrayUtils.get(array, 6);
		System.out.println(integer);
		try {
			Integer integer2 = array[5];
			System.out.println(integer2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 获取数组的第n个元素，如果索引超出范围，则获取默认值。
		Integer integer3 = ArrayUtils.get(array, 6, -1);
		System.out.println(integer3);
	}

	/***
	 * // 自定义排序规则验证数组是否正确排序
	 */
	@Test
	public void isSortedComparatorTest() {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 1, 3, 5, 2, 4 };
		Integer[] array3 = { 5, 4, 3, 2, 1 };
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				// 倒叙排序
				return (x < y) ? 1 : ((x == y) ? 0 : -1);
			}
		};
		System.out.println(ArrayUtils.isSorted(array1, comparator));
		System.out.println(ArrayUtils.isSorted(array2, comparator));
		System.out.println(ArrayUtils.isSorted(array3, comparator));
	}

	@Test
	public void isSortedTest() {
		// 验证数组是否正序排序
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 1, 3, 5, 2, 4 };
		Integer[] array3 = { 5, 4, 3, 2, 1 };
		System.out.println(ArrayUtils.isSorted(array1));
		System.out.println(ArrayUtils.isSorted(array2));
		System.out.println(ArrayUtils.isSorted(array3));
	}

	@Test
	public void nullToEmptyTest() {
		// null值数组转空值数组
		Integer[] array1 = null;
		Integer[] array2 = ArrayUtils.nullToEmpty(array1);
		System.out.println(array1);
		System.out.println(ArrayUtils.toString(array2));
	}

	@Test
	public void containsTest() {
		// 判断数组中包含某个值
		Integer[] array = { 1, 2, 3, 4, 5 };
		System.out.println(ArrayUtils.contains(array, 3));
		System.out.println(ArrayUtils.contains(array, 6));
	}

	@Test
	public void addTest() {
		// 数组添加一个元素
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array = ArrayUtils.add(array1, 6);
		System.out.println(ArrayUtils.toString(array));
	}

	@Test
	public void addAllTest() {
		// 合并两个数组
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 6, 7, 8 };
		Integer[] array = ArrayUtils.addAll(array1, array2);
		System.out.println(ArrayUtils.toString(array));
	}

	/*
	 * 返回一个新的数组,首位元素为给定元素,其余为传入数组
	 */
	@Test
	public void addFirstTest() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer[] addFirst = ArrayUtils.addFirst(array, 0);
		System.out.println(ArrayUtils.toString(array));
		System.out.println(ArrayUtils.toString(addFirst));
	}

	@Test
	public void removeTest() {
		System.out.println("\n-remove-\n");
		// 删除对应索引的元素
		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer[] remove = ArrayUtils.remove(array, 4);
		System.out.println(ArrayUtils.toString(array));
		System.out.println(ArrayUtils.toString(remove));

		System.out.println("\n-removeAll-\n");

		Integer[] removeAll = ArrayUtils.removeAll(array, 3, 4);
		System.out.println(ArrayUtils.toString(array));
		System.out.println(ArrayUtils.toString(removeAll));

		System.out.println("\n-removeAllOccurrences-\n");

		Integer[] array1 = { 1, 2, 3, 4, 5, 3, 4 };
		// 根据值删除元素所有值相同的元素
		Integer[] removeAllOccurrences = ArrayUtils.removeAllOccurrences(array, 3);
		System.out.println(ArrayUtils.toString(array));
		System.out.println(ArrayUtils.toString(removeAllOccurrences));

		System.out.println("\n-removeElements-\n");

		// 根据值删除首次出现的元素
		Integer[] removeElements = ArrayUtils.removeElements(array1, 3, 4);
		System.out.println(ArrayUtils.toString(array));
		System.out.println(ArrayUtils.toString(removeElements));

	}

	@Test
	public void isEmptyTest() {
		// 空数组判断
		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer[] arrayEmpty = {};
		System.out.println(ArrayUtils.isEmpty(array));
		System.out.println(ArrayUtils.isEmpty(arrayEmpty));
	}

	@Test
	public void cloneTest() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer[] clone = ArrayUtils.clone(array);
		System.out.println(ArrayUtils.toString(array));
		clone[4] = 6;
		System.out.println(ArrayUtils.toString(clone));
	}
}
