package controller;

import model.estrutura.Stack;
import model.estrutura.No;

public class StackController {

	public StackController(){
		super();
	}

	public String teste() throws Exception{
		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		return stack.toString();
	}
}