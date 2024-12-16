package model.estrutura.lista;

import java.lang.Exception;
import model.estrutura.lista.No;

public class ListaEncadeadaSimples<T> {
	
	private No<T> inicio = null;
	
	
	public void append(T elemento) {
		No<T> buffer = new No<>(elemento);
		if(this.inicio == null) {
			this.inicio = buffer;
		} else {
			this.last().setProximo(buffer);
		}
	}
	
	public No<T> last() throws IllegalArgumentException {
		if(this.inicio == null) {
			throw new IllegalArgumentException("Nao existe item na lista");
		}
		No<T> buffer = this.inicio;
		while(buffer.getProximo() != null) {
			buffer = buffer.getProximo();
		}
		return buffer;
	}
	
	@Override
	public String toString() {
		if(this.inicio == null) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getValor());
		while(buffer.getProximo() != null) {
			builder.append(",");
			buffer = buffer.getProximo();
			builder.append(buffer.getValor());
		}
		builder.append("]");
		return builder.toString();
	}
}
