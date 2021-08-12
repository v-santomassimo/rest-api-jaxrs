package com.restApi.ResfulApiJaxRS.utils;

public class Utility {
	
	public static String getConsonant(String stringa) {
		if(stringa.equals("")) return "";
		else if (stringa.charAt(0)=='a'||
	             stringa.charAt(0)=='e'||
	             stringa.charAt(0)=='i'||
	             stringa.charAt(0)=='o'||
	             stringa.charAt(0)=='u') return getConsonant(stringa.substring(1));
	    else return stringa.substring(0,1) + getConsonant(stringa.substring(1));
	}
	
	public static String generateStudentId(String nameConsonant, String lastnameConsonant) {
		String studentId = nameConsonant.toUpperCase() + lastnameConsonant.toUpperCase() + String.valueOf(Math.random()*1000).replace(".", "");
		return studentId;
	}

}
