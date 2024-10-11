package Excecoes;

public class Senhatest {
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
			}else {
				throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
  public static void main(String[] args) {
	  try {
		  autenticar("123");
	  }catch(SenhaInvalidaException e) {
		  System.out.println(e.getMessage());
	  }
  }
}
