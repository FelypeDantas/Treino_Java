package controller;

public class ProcessosController {

	public ProcessosController() {
		super();
	}
	
	//Sistema operacional em execução na máquina
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void callProcess(String process) {
		try {
			Runtime.getRuntime().exec(process);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
