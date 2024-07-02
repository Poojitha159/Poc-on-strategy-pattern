package com.techlabs.strategy.model;

public class OperationStrategy implements IOoperation{
	
	IOoperation operation;

	

	public OperationStrategy(IOoperation operation) {
		super();
		this.operation = operation;
	}



	@Override
	public int doOperation(int a, int b) {
		
		return operation.doOperation(a, b);
	}
	
	public void setOperation(IOoperation operation) {
		this.operation=operation;
	}



	@Override
	public String description() {
		
		return operation.description();
	}
	

}
