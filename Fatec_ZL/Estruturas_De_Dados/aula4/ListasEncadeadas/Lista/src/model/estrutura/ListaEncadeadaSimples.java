package model.estrutura;

import java.lang.Exception;
import model.estrutura.No;

public class ListaEncadeadaSimples<T> {

	private No<T> inicio = null;

	public void append (T elemento){
		No<T> buffer = new No<>(elemento);
		if(this.inicio == null){
			this.inicio = buffer;
		}
		else{	
			this.last().setProximo(buffer);
		}
	}

	public No<T> get(int index) throws IllegalArgumentException{
		int i = 0;
		if(this.inicio == null){
			throw new IllegalArgumentException("Nao existe item na lista");
		}

		No<T> buffer = this.inicio;
		for(i = 0;  i < index ; i++) {
			if(buffer.getProximo() == null){
				break;
			}
			buffer = buffer.getProximo();
		}

		if(i < index){
			throw new IllegalArgumentException("O indice informado nao existe");
		}
		return buffer;
	}


	public int index(T elemento) throw s IllegalArgumentException {
		if(this.inicio == null){
			throw new IllegalArgumentException("Nao existe item na lista");
		}

		int index = 0;
		if(this.inicio.getValor() == elemento){
			return index;
		}
		No<T> buffer = this.inicio;
		do{
			if(buffer.getValor() == elemento){
				return index;
			}
			buffer = buffer.getProximo();
			index++;

		} while(buffer != null);
		throw new IllegalArgumentException("Item nao encontrado");
	}

	public void insert(int index, T elemento) throws IllegalArgumentException {
		if(index == 0){
			No<T> buffer_novo = new No<>(elemento);
			if(this.inicio != null){
				No<T> buffer_inicio = this.inicio;
				buffer_novo.setProximo(buffer_inicio);
				this.inicio = buffer_novo;
			} else {
				this.inicio = buffer_novo;
			}
		} else {
			this.insert(this.get(--index), elemento);
		}
	}

	public void insert(No<T> item, T elemento) throws IllegalArgumentException {
		No<T> buffer_novo = new No<>(elemento);
		No<T> buffer_proximo = item.getProximo();
		item.setProximo(buffer_proximo);
	}

	public No<T> last() throws IllegalArgumentException {
		if(this.inicio == null){
			throw new IllegalArgumentException("nao existe item na lista");
		}
		No<T> buffer = this.inicio;
		while(buffer.getProximo()!= null){
			buffer = buffer.getProximo();
		}
		return buffer;
	}

	public void remove(int index){
		if(index == 0){
			this.inicio.setValor(null);
			if(this.inicio.getProximo() == null){
				this.inicio = null;
			} else {
				No<T> buffer = this.inicio.getProximo();
				this.inicio.setProximo(null);
				this.inicio = buffer;
			}
			return ;
		}
		No<T> buffer_anterior = this.get(index - 1);
		No<T> item = buffer_anterior.getProximo();
		No<T> buffer_proximo = item.getProximo();
		buffer_anterior.setProximo(buffer_proximo);
		item.setProximo(null);
		item.setValor(null);
	}

	public int total() {
		if(this.inicio == null){
			return 0;
		}
		No<T> buffer = this.inicio;
		int total_elementos = 0;

		do{
			total_elementos++;
			buffer = buffer.getProximo();
		} while(buffer != null);
		return total_elementos;
	}

	@Override
	public String toString(){
		if(this.inicio == null){
			return "[]";
		}
	
		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getValor());
		while(buffer.getProximo() != null){
			builder.append(",");
			buffer = buffer.getProximo();
			builder.append(buffer.getValor());
		}
		builder.append("]");
		return builder.toString();
	}
}
		
		
		