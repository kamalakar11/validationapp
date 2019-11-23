package com.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.testing.TestPractice;

public class MobileValidation {

	public boolean isValidMobile(String mobile) {
		System.out.println("Validation strated!!");
		TestPractice practice = new TestPractice();
		practice.printMobile(mobile);
        Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher(mobile); 
        System.out.println("Validation done!!");
        System.out.println("Validation done added changes!!");
        return m.matches();
	}
}
