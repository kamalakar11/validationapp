package com.validations;

public class Test {

	public static void main(String[] args) {
		MobileValidation mobVal = new MobileValidation();
		boolean isValid = mobVal.isValidMobile("6848022338");
		System.out.println(isValid);
	}
}
