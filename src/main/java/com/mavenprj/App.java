package com.mavenprj;

import java.util.ResourceBundle;

public class App {

	public int userLOgin(String In_User, String in_pwd) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String passWord = rb.getString("password");
		if(In_User.equals(userName) && (in_pwd.equals(passWord))) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
