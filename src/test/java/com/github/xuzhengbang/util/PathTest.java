package com.github.xuzhengbang.util;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.soap.SOAPBinding;

import org.junit.Test;

public class PathTest {
	
	@Test
	public void toFile() {
		Path path = Paths.get("/a/b/c/d");
		File file = path.toFile();
		System.out.println(file.exists());
	}
	
	
	@Test
	public void getFileName() {
		Path path = Paths.get("/a/b/c/d");
		Path fileName = path.getFileName();
		System.out.println(fileName.toString());
		System.out.println(path.toFile().getName());
	}
	
	@Test
	public void getParent() {
		Path path = Paths.get("/a/b/c/d");
		Path parent = path.getParent();
		System.out.println(parent);
	}
	
	@Test
	public void getFor() {
		Path path = Paths.get("/a/b/c/d");
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
	
	@Test
	public void getWhile() {
		System.out.println("-while-");
		Path path = Paths.get("/a/b/c/d");
		Iterator<Path> iterator = path.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	@Test
	public void relativize() {
		Path path1 = Paths.get("/a");
		Path path2 = Paths.get("/a", "/b");
		// 相对路径获取
		Path relativize = path1.relativize(path2);
		System.out.println(relativize);
	}

	
	@Test
	public void resolve() {
		Path path = Paths.get("/a", "/b");
		// 相对路径拼接
		Path resolve = path.resolve("c");
		System.out.println(resolve);
		// 绝对路径替换
		resolve = path.resolve("/d/e");
		System.out.println(resolve);
	}
}
