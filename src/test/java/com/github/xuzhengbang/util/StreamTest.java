package com.github.xuzhengbang.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;

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
	
	@Test
	public void group() {
		Integer[] array = { 1, 2, 3, 4, 5, 1, 3, 5 };
		Map<Integer, List<Integer>> collect = Stream.of(array).collect(Collectors.groupingBy(Integer::intValue));
		for (Entry<Integer, List<Integer>> entry : collect.entrySet()) {
			ConsoleUtils.println(entry.getKey().toString(), StringUtils.join(entry.getValue(), ","));
		}
	}
	
	@Test
	public void toMap() {
		List<StreamEntity> list = Lists.newArrayList();
		list.add(new StreamEntity("1", "a"));
		list.add(new StreamEntity("2", "b"));
		list.add(new StreamEntity("3", "c"));
		list.add(new StreamEntity("4", "d"));
		list.add(new StreamEntity("5", "e"));
		// 重复KEY
//		list.add(new StreamEntity("5", "f"));
		
		Map<String, StreamEntity> collect = list.stream().collect(Collectors.toMap(StreamEntity::getKey, Function.identity()));
//		list.stream().collect(Collectors.toMap(item -> item.getKey(), item -> item));
		// 重复KEY
//		Map<String, StreamEntity> collect = list.stream().collect(Collectors.toMap(StreamEntity::getKey, Function.identity(), (o1, o2) -> o1));
		for (Entry<String, StreamEntity> entry : collect.entrySet()) {
			ConsoleUtils.println(entry.getKey().toString(), entry.getValue());
		}
	}
	
	
	
}

@Data
@AllArgsConstructor
class StreamEntity{
	
	private String key;
	
	private String value;
}
