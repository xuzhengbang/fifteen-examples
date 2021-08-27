package com.github.xuzhengbang.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class FilesTest {

	private Path BASE_PATH = Paths.get("D:\\usr\\tmp\\2021\\08\\files");

	/**
	 * 硬链接
	 */
	@Test
	public void hardLinkTest() {
		try {
			Path createFile = Files.createFile(BASE_PATH.resolve("Hard_Link.txt"));
			Files.write(createFile, "Hard Link".getBytes());

			Path createLink1Path = BASE_PATH.resolve("Hard_Link_1.txt");
			Files.createLink(createLink1Path, createFile);
			Path createLink2Path = BASE_PATH.resolve("Hard_Link_2.txt");
			Files.createLink(createLink2Path, createLink1Path);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// https://www.cnblogs.com/Naylor/p/7597869.html
	@Test
	public void symbolicLinkTest() {
		try {
			Path createDirectories = Files.createDirectories(BASE_PATH.resolve("Symbolic_Link_Target"));
			ConsoleUtils.println("Files.createDirectories(BASE_PATH.resolve(\"Symbolic_Link\"))", createDirectories);

			Path createFile = Files.createFile(createDirectories.resolve("Symbolic_Link_Target.txt"));
			Files.write(createFile, "Symbolic Link Target".getBytes());
			Path createDirectory = Files.createDirectory(createDirectories.resolve("Symbolic_Link_In"));

			// 需以管理员运行
			Path symbolicLink1Path = BASE_PATH.resolve("Symbolic_Link_1");
			Files.createSymbolicLink(symbolicLink1Path, createDirectories);
			// CMD mklink /d Symbolic_Link1 Symbolic_Link

			ConsoleUtils.println("Files.isSymbolicLink(symbolicLink1Path)", Files.isSymbolicLink(symbolicLink1Path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void delete() {
		try {
			clear();
			Path deleteIfExistsPath = Files.createFile(BASE_PATH.resolve("deleteIfExists.txt"));
			Files.write(deleteIfExistsPath, "deleteIfExists".getBytes());
			ConsoleUtils.println("Files.deleteIfExists(deleteIfExistsPath)", Files.deleteIfExists(deleteIfExistsPath));

			Path deletePath = Files.createFile(BASE_PATH.resolve("delete.txt"));
			Files.write(deletePath, "delete".getBytes());
			Files.delete(deletePath);
			ConsoleUtils.println("Files.delete(deletePath)", "OK");

			ConsoleUtils.println("Files.deleteIfExists(deletePath)", Files.deleteIfExists(deletePath));
			try {
				Files.delete(deleteIfExistsPath);
			} catch (Exception e) {
				ConsoleUtils.println("Files.delete(deleteIfExistsPath)",
						e.getClass().getName() + " : " + e.getMessage());
			}
			Path createDirectory = Files.createDirectory(BASE_PATH.resolve("DELETE_DIRECTORY"));
			Path directoryInPath = Files.createFile(createDirectory.resolve("DIRECTORY_IN.txt"));
			try {
				Files.delete(createDirectory);
			} catch (Exception e) {
				ConsoleUtils.println("Files.delete(createDirectory)",
						e.getClass().getName() + " : " + e.getMessage());
			}
			Files.delete(directoryInPath);
			ConsoleUtils.println("Files.delete(directoryInPath)", directoryInPath, "OK");
			Files.delete(createDirectory);
			ConsoleUtils.println("Files.delete(createDirectory)", createDirectory, "OK");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void clear() {
		try {
			List<Path> collect = Files.walk(BASE_PATH) //
					.filter(item -> item.compareTo(BASE_PATH) != 0) //
					.sorted(new Comparator<Path>() {
						@Override
						public int compare(Path o1, Path o2) {
							return Integer.compare(o1.getNameCount(), o2.getNameCount()) * -1;// 路径最长倒叙
						}
					}).collect(Collectors.toList());
			// 先删除最底层的文件/文件夹
			for (Path path : collect) {
				System.out.println(path);
				Files.delete(path);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void other() {
		// 判断是否存在
		ConsoleUtils.println("Files.exists(BASE_PATH)", Files.exists(BASE_PATH));
		// Console_> true
		// -
		// 判断是否不存在
		ConsoleUtils.println("Files.notExists(BASE_PATH)", Files.notExists(BASE_PATH));
		// Console_> false
		// -
		// 判断是否是文件夹
		ConsoleUtils.println("Files.isDirectory(BASE_PATH)", Files.isDirectory(BASE_PATH));
		// Console_> true
		// -
		// 判断是否是文件
		ConsoleUtils.println("Files.isRegularFile(BASE_PATH)", Files.isRegularFile(BASE_PATH));
		// Console_> false
	}
}
