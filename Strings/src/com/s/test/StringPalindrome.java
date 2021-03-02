package com.s.test;

public class StringPalindrome {

	public static void main(String[] args) {
		StringPalindrome sp= new StringPalindrome();
		sp.isPalindrome("srs");
	}
	
		private boolean isPalindrome(String str) {
		    if (str == null)
		        return false;
		    StringBuilder strBuilder = new StringBuilder(str);
		    strBuilder.reverse();
		    //System.out.println("hai");
		    return strBuilder.toString().equals(strBuilder);
		   
		}
	}


