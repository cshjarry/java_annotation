package com.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDK {
	
	public static void main (String args []){

		UserService userService = MyBeanFactory.createService();
		userService.addUser();

	}

}
