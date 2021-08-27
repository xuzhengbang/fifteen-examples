package com.github.xuzhengbang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class IOTest {

	
	@Test
	public void close1() {
		InputStream inputStream = null;
		try {
			inputStream = IOUtils.toInputStream("测试数据");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void close2() {
		InputStream inputStream = null;
		try {
			inputStream = IOUtils.toInputStream("测试数据");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(inputStream);
		}
	}

}
