package Criando_objetos;

public class Conta {
  String cliente;
  double saldo;
  
  void ExibirSaldo() {
	  System.out.println(cliente +" o seu saldo é " +saldo);
  }
  
  void Saque(double valor) {
	  saldo -= valor;
  }
  
  void Deposito(double valor) {
	  saldo += valor;
  }
  
  void TransferenciaValor(Conta destino, double valor) {
	  this.Saque(valor);
	  destino.Deposito(valor);
  }
}
