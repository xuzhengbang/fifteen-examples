package com.github.xuzhengbang.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {

	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("/a/b/c/d");
//		Files.exists(path, options);// java.nio.file.LinkOption.NOFOLLOW_LINKS

		Path existingFilePath = Paths.get("D:\\usr\\tmp\\2021\\08\\link", "text.txt");
		Path symLinkPath = Paths.get("D:\\usr\\tmp\\2021\\08\\link", "1_link");
//		Files.createSymbolicLink(symLinkPath, existingFilePath);
		
		// TODO 硬链接 软连接
		boolean symbolicLink = Files.isSymbolicLink(symLinkPath);
		System.out.println(symbolicLink);
		
		
		Path path1 = Paths.get("/1/2");
		Path path2 = Paths.get("/1/2");
		Path subpath = path2.subpath(0, path2.getNameCount());
		Path resolve = path1.resolve("3").resolve(subpath).resolve("4.txt");
		System.out.println(resolve);
		
		
		Path path = Paths.get(path1.toString(), "3", path2.toString(), "4.txt");
		System.out.println(path);
	}

}
