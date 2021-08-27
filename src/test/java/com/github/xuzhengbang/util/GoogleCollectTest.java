package com.github.xuzhengbang.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class GoogleCollectTest {

	@Test
	public void listsTest() {
		List<Integer> arrayList = Lists.newArrayList(1, 2, 3);
		System.out.println(arrayList);
	}

	@Test
	public void hashBiMapTest() {
		BiMap<Object, Object> biMap = HashBiMap.create();
		biMap.put(1, "一");
		biMap.put(2, "二");
		biMap.put(3, "三");
		biMap.put(4, "四");

		System.out.println("\n-get-");
		System.out.println(biMap.get(1));
		System.out.println(biMap.get("二"));
		System.out.println("\n-inverse & get-");
		System.out.println(biMap.inverse().get("二"));
		System.out.println(biMap.inverse().get(1));

		System.out.println("\n-key 重复-");
		biMap.put(4, "肆");
		System.out.println(biMap.get(4));
		System.out.println("\n-value 重复-");
		try {
			biMap.put(5, "肆");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void other() {
		Map<Object, Object> hashMap = Maps.newHashMap();
		Map<Object, Object> linkedHashMap = Maps.newLinkedHashMap();
		Set<Object> hashSet = Sets.newHashSet();
		Set<Object> linkedHashSet = Sets.newLinkedHashSet();

	}

}
