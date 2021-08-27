package com.github.xuzhengbang.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import cn.hutool.core.util.ReUtil;

public class Test {

	public static void main(String[] args) throws IOException {

		Path temp = Paths.get("D:\\usr\\tmp\\2021\\08\\166\\34749f3eb4bf4f20a32a5e3c7958e33d");
		List<Path> collect = Files.walk(temp).filter(Files::isRegularFile).sorted(new Comparator<Path>() {
			public int compare(Path o1, Path o2) {
				if (StringUtils.equalsAnyIgnoreCase(FilenameUtils.getExtension(o1.toFile().getName()),
						FilenameUtils.getExtension(o2.toFile().getName()))) {
					return 0;
				}
				if (StringUtils.equalsIgnoreCase("xml", FilenameUtils.getExtension(o1.toFile().getName()))) {
					return -1;
				} else {
					return 1;
				}
			}
		}).collect(Collectors.toList());

//		Path[] fileSorts = collect.toArray(new Path[0]);
//		Arrays.sort(fileSorts, new Comparator<Path>() {
//			public int compare(Path o1, Path o2) {
//				if (StringUtils.equalsAnyIgnoreCase(FilenameUtils.getExtension(o1.toFile().getName()),
//						FilenameUtils.getExtension(o2.toFile().getName()))) {
//					return 0;
//				}
//				if (StringUtils.equalsIgnoreCase("xml", FilenameUtils.getExtension(o1.toFile().getName()))) {
//					return -1;
//				} else {
//					return 1;
//				}
//			}
//		});
//		for (Path path : collect) {
//			System.out.println(path);
//		}
		
		String escape = ReUtil.escape(".*/a/b/c");
		System.out.println(escape);
	}

}
