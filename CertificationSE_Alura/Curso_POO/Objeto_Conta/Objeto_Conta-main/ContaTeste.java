package Criando_objetos;

public class ContaTeste {
  public static void main(String args []) {
	  
	  Conta conta = new Conta();
	  conta.cliente = "Daniel";
	  conta.saldo = 4_000.00;
	  conta.ExibirSaldo();
	  
	  //conta.Saque(2000);
	  //conta.ExibirSaldo();
	  
	  //conta.Deposito(8000);
	  //conta.ExibirSaldo();
	  
	  Conta destino = new Conta();
	  destino.cliente = "Carlos";
	  destino.saldo = 5_000.00;
	  destino.ExibirSaldo();
  }
}
