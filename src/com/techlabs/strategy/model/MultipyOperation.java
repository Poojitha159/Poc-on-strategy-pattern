package com.techlabs.strategy.model;

public class MultipyOperation implements IOoperation {

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public String description() {
		
		return "Description for operation Multiplication ";
	}
	
}
