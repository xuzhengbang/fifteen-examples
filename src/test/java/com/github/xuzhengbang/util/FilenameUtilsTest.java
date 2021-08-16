package com.github.xuzhengbang.util;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class FilenameUtilsTest {
	
	@Test
	public void filenameTest() {
		String filename = "/usr/local/test.txt";
		
		System.out.println("-normalize unix-");
		System.out.println(FilenameUtils.normalize(filename, true));
		
		System.out.println("\n-normalize windows-");
		System.out.println(FilenameUtils.normalize(filename, false));
		
		System.out.println("\n-getName-");
		System.out.println(FilenameUtils.getName(filename));
		
		System.out.println("\n-getExtension-");
		System.out.println(FilenameUtils.getBaseName(filename));
		
		System.out.println("\n-getExtension-");
		System.out.println(FilenameUtils.getExtension(filename));
		
		System.out.println("\n-isExtension-");
		System.out.println(FilenameUtils.isExtension(filename, "txt"));
		System.out.println(FilenameUtils.isExtension(filename, "TXT"));
		
		System.out.println("\n-getExtension & equalsIgnoreCase-");
		System.out.println(StringUtils.equalsIgnoreCase(FilenameUtils.getExtension(filename), "txt"));
		System.out.println(StringUtils.equalsIgnoreCase(FilenameUtils.getExtension(filename), "TXT"));
		
	}

}
