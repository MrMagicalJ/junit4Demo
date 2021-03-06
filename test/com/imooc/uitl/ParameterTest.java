package com.imooc.uitl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	
	/*
	 * 1.更改默认的测试运行器为@RunWith(Parameterized.class)。
	 * 2.声明变量来存放预期值和结果值。
	 * 3.声明一个返回值为Collection的静态方法，并使用@Parameters修饰。
	 * 4.为测试类声明一个带参数的公共构造函数，并在其中为之声明变量赋值。
	 */
	int excepted = 0;
	int input1 = 0;
	int input2 = 0;
	
	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][]{
				{3,1,2},
				{4,2,2}
		});
	}
	
	public ParameterTest(int excepted,int input1,int input2) {
		this.excepted = excepted;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Test
	public void TestAdd() {
		assertEquals(excepted,new Calculate().add(input1, input2));
	}


}
