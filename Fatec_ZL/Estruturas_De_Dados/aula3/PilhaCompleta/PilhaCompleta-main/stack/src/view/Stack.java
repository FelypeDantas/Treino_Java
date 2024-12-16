package view;

import controller.StackController;

public class Stack {

	public static void main(String[] args){
		
		try{
			StackController obj = new StackController();
			System.out.println(obj.teste());
		} catch(Exception e) {
			System.err.println("Deu ruim");
		}
	}
}