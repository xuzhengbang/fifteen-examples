package com.github.xuzhengbang.util;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import com.github.xuzhengbang.entity.BeanUtilsTestEntity;

import lombok.Data;

public class BeanTest {

	@Test
	public void apacheCopy1() throws Exception {
		BeanEntity orig = new BeanEntity();
		orig.setKey("1");
		orig.setValue("a");
		BeanEntity dest = new BeanEntity();
		BeanUtils.copyProperties(dest, orig);
		ConsoleUtils.println("orig", orig);
		ConsoleUtils.println("dest", dest);
	}
	
	@Test
	public void apacheCopy2() throws Exception {
		BeanUtilsTestEntity orig = new BeanUtilsTestEntity();
		orig.setKey("1");
		orig.setValue("a");
		BeanUtilsTestEntity dest = new BeanUtilsTestEntity();
		BeanUtils.copyProperties(dest, orig);
		ConsoleUtils.println("orig", orig);
		ConsoleUtils.println("dest", dest);
	}
	
	@Test
	public void springCopy1() throws Exception {
		BeanEntity orig = new BeanEntity();
		orig.setKey("1");
		orig.setValue("a");
		BeanEntity dest = new BeanEntity();
		org.springframework.beans.BeanUtils.copyProperties(orig, dest);
		ConsoleUtils.println("orig", orig);
		ConsoleUtils.println("dest", dest);
	}
	
	public void springCopy2() {
		BeanUtilsTestEntity orig = new BeanUtilsTestEntity();
		orig.setKey("1");
		orig.setValue("a");
		BeanUtilsTestEntity dest = new BeanUtilsTestEntity();
		org.springframework.beans.BeanUtils.copyProperties(orig, dest);
		ConsoleUtils.println("orig", orig);
		ConsoleUtils.println("dest", dest);
	}

}

@Data
class BeanEntity {
	
	private String key;
	
	private String value;
	
}
