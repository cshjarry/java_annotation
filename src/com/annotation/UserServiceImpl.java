package com.annotation;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("proxy.jdk addUser");
	}


}
