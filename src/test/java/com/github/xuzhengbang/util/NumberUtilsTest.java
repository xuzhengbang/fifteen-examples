package com.github.xuzhengbang.util;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class NumberUtilsTest {
	
	/**
	 * {@link com.github.xuzhengbang.util.NumberUtilsTest.isCreatableTest()}
	 */
	public void isNumberTest() {
		NumberUtils.isNumber("1");
	}

	@Test
	public void isCreatableTest() {
		// 检查字符串是否为有效的Java数字, 包含科学计数法、十六进制数字、八进制数字和用类型限定符标记的数字（例如123L）
		ConsoleUtils.println("NumberUtils.isCreatable(\"1\")", NumberUtils.isCreatable("1"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"1,000\")", NumberUtils.isCreatable("1,000"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"1.5\")", NumberUtils.isCreatable("1.5"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"1L\")", NumberUtils.isCreatable("1L"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"1D\")", NumberUtils.isCreatable("1D"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"0xA\")", NumberUtils.isCreatable("0xA"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"0xG\")", NumberUtils.isCreatable("0xG"));
		// Console_> false // 0x 十六进制 G不属于16进制范畴
		ConsoleUtils.println("NumberUtils.isCreatable(\"012\")", NumberUtils.isCreatable("012"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isCreatable(\"09\")", NumberUtils.isCreatable("09"));
		// Console_> false // 前导0 八进制, 9不属于8进制范畴
		ConsoleUtils.println("NumberUtils.isCreatable(\"1.e+0\")", NumberUtils.isCreatable("1.e+0"));
		// Console_> true
	}
	
	@Test
	public void isParsableTest() {
		// 检查给定字符串是否为可解析, 不包含科学计数法、、十六进制数字、八进制数字和用类型限定符标记的数字（例如123L）
		ConsoleUtils.println("NumberUtils.isParsable(\"1\")", NumberUtils.isParsable("1"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isParsable(\"1,000\")", NumberUtils.isParsable("1,000"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isParsable(\"1.5\")", NumberUtils.isParsable("1.5"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isParsable(\"1L\")", NumberUtils.isParsable("1L"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isParsable(\"1D\")", NumberUtils.isParsable("1D"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isParsable(\"0xA\")", NumberUtils.isParsable("0xA"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isParsable(\"0xG\")", NumberUtils.isParsable("0xG"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isParsable(\"012\")", NumberUtils.isParsable("012"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isParsable(\"09\")", NumberUtils.isParsable("09"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isParsable(\"1.e+0\")", NumberUtils.isParsable("1.e+0"));
		// Console_> false
	}
	
	@Test
	public void isDigitsTest() {
		// 检查字符串是否仅包含数字字符
		ConsoleUtils.println("NumberUtils.isDigits(\"1\")", NumberUtils.isDigits("1"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isDigits(\"1,000\")", NumberUtils.isDigits("1,000"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isDigits(\"1.5\")", NumberUtils.isDigits("1.5"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isDigits(\"1L\")", NumberUtils.isDigits("1L"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isDigits(\"1D\")", NumberUtils.isDigits("1D"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isDigits(\"0xA\")", NumberUtils.isDigits("0xA"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isDigits(\"0xG\")", NumberUtils.isDigits("0xG"));
		// Console_> false
		ConsoleUtils.println("NumberUtils.isDigits(\"012\")", NumberUtils.isDigits("012"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isDigits(\"09\")", NumberUtils.isDigits("09"));
		// Console_> true
		ConsoleUtils.println("NumberUtils.isDigits(\"1.e+0\")", NumberUtils.isDigits("1.e+0"));
		// Console_> false
	}
}
