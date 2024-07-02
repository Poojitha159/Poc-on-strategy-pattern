package com.techlabs.strategy.test;

import com.techlabs.strategy.model.AddOperation;
import com.techlabs.strategy.model.MultipyOperation;
import com.techlabs.strategy.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {


		OperationStrategy op=new OperationStrategy(new AddOperation());
		
		System.out.println(" Result for Addition strategy is: "+op.doOperation(10, 20));
		System.out.println(op.description());
		
		op.setOperation(new MultipyOperation());
		System.out.println(" Result of Multiply strategy is: "+op.doOperation(2,3));
		System.out.println(op.description());
	}

}
