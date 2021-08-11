package com.github.xuzhengbang.util;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import com.google.common.collect.Lists;

public class CollectionsTest {

	@Test
	public void sortTest() {
		ArrayList<Integer> arrayList = Lists.newArrayList(2, 4, 6, 5, 3, 1);
		Collections.sort(arrayList);// 正序排序
		System.out.println(arrayList);
	}
	
	@Test
	public void test() {
		ArrayList<Integer> arrayList = Lists.newArrayList(2, 4, 6, 5, 3, 1);
		Collections.reverse(arrayList);// 索引逆序
		System.out.println(arrayList);
	}
}
