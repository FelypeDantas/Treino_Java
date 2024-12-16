package model.estrutura.arvore;

public class No<T> {

	private T valor;
	private No<T> maior;
	private No<T> menor;
	
	public No(T valor) {
		this.valor = valor;
		this.maior = null;
		this.menor = null;
	}
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public No<T> getMaior(){
		return maior;
	}
	
	public void setMaior(No<T> maior) {
		this.maior = maior;
	}
	
	public No<T> getMenor(){
		return menor;
	}
	
	public void setMenor(No<T> menor) {
		this.menor = menor;
	}
	
	@Override
	public String toString() {
		return valor.toString();
	}

}
