package com.techlabs.strategy.model;

public class AddOperation implements IOoperation {

	@Override
	public int doOperation(int a, int b) {
		
		return a+b;
	}

	@Override
	public String description() {
		
		return "Description for operation addition ";
	}
	

}
