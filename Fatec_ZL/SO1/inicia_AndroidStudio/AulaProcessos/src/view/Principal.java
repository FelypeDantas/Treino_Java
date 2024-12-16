package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		ProcessosController processos = new ProcessosController();
//		String os = processos.os();
//		
//		System.out.println(os);
		
		String process = "cmd /c C:\\Users\\Windows\\Downloads\\android-studio-2023.3.1.18-windows.exe";
		processos.callProcess(process);

	}

}
