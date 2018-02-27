package com.samir;

public class Calculator {
	public int userDefinedValue;
	
	public int addition(int firstNo,int secondNo){
		int sum = firstNo + secondNo + userDefinedValue;
		
		return sum;
	}
	public int multiplication(int firstNo,int secondNo){
		int mul = (firstNo * secondNo)+userDefinedValue;
		return mul;
	}
	
	public boolean checkEquals(int firstNo,int secondNo){
		if (firstNo == secondNo) {
			System.out.println("Both Numbers Are Equal");
		
		    return true;
		
		}
		
	    return false;
	}
}
