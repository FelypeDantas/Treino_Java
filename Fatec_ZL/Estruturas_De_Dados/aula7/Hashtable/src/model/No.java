package model;

public class No<T> {

	private int chave;
	private T valor;
	
	public No(int chave, T valor){
		this.chave = chave;
		this.valor = valor;
	}
	
	public getChave(){
		return chave;
	}
	
	public setChave(int chave){
		this.chave = chave;
	}
	
	public getValor(){
		return valor;
	}
	
	public setValor(T valor){
		this.valor = valor;
	}
	
	@Override
	public String toString(){
		return valor.toString();
	}
}