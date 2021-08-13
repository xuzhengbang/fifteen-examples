package com.github.xuzhengbang.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {
	
	@Test
	public void count() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		long count = Stream.of(array).count();
		System.out.println(count);
	}
	
	
	@Test
	public void array() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> collect = Stream.of(array).collect(Collectors.toList());
		System.out.println(collect);
		collect.add(6);
		System.out.println(collect);
	}
	
}
