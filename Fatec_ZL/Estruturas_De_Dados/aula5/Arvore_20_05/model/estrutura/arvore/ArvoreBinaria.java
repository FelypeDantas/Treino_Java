package model.estrutura.arvore;

import model.estrutura.arvore.No;
import model.estrutura.lista.ListaEncadeadaSimples;

public class ArvoreBinaria <T extends Comparable> {

	private No<T> raiz;
	private int tamanho = 0;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void adicionar(T valor) {
		No<T> novo = new No<T>(valor);
		tamanho++;
		if(raiz == null) {
			this.raiz = novo;
			return;
		}
		
		No<T> atual = this.raiz;
		while(true) {
			if(novo.getValor().compareTo(atual.getValor()) == -1) {
				if(atual.getMenor() != null) {
					atual = atual.getMenor();
				} else {
					atual.setMenor(novo);
					break;
				}
			} else {
				if(atual.getMaior() != null) {
					atual = atual.getMaior();
				} else {
					atual.setMaior(novo);
					break;
				}
			}
		}
	}
	
	public ListaEncadeadaSimples ordem() {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		No<T> atual = this.raiz;
		ordem(atual, lista);
		return lista;
	}
	
	public ListaEncadeadaSimples preoOrdem() {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		No<T> atual = this.raiz;
		preoOrdem(atual, lista);
		return lista;
	}
	
	public ListaEncadeadaSimples posoOrdem() {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		No<T> atual = this.raiz;
		posoOrdem(atual, lista);
		return lista;
	}
	
	private void ordem(No<T> atual, ListaEncadeadaSimples lista) {
		if(atual != null) {
			ordem(atual.getMenor() , lista);
			lista.append(atual.getValor());
			ordem(atual.getMaior() , lista);
		}
	}
	
	private void preoOrdem(No<T> atual, ListaEncadeadaSimples lista) {
		if(atual != null) {
			lista.append(atual.getValor());
			preoOrdem(atual.getMenor() , lista);
			preoOrdem(atual.getMaior() , lista);
		}
	}
	
	private void posoOrdem(No<T> atual, ListaEncadeadaSimples lista) {
		if(atual != null) {
			posoOrdem(atual.getMenor() , lista);
			posoOrdem(atual.getMaior(), lista);
			lista.append(atual.getValor());
		}
	}
	
	public boolean remove(T valor) {
		No<T> atual = this.raiz;
		No<T> paiAtual = null;
		while(atual != null) {
			if(atual.getValor().equals(valor)) {
				break;
			} else if(valor.compareTo(atual.getValor()) == -1){
				paiAtual = atual;
				atual = atual.getMenor();
			} else {
				paiAtual = atual;
				atual = atual.getMaior();
			}
		}
		
		if(atual == null) {
			return false;
		}
		
		if(atual.getMaior() != null) {
			No<T> substituto = atual.getMaior();
			No<T> paiSubstituto = atual;
			while(substituto.getMenor() != null) {
				paiSubstituto = substituto;
				substituto = substituto.getMenor();
			}
			substituto.setMenor(atual.getMenor());
			if(paiAtual != null) {
				if(atual.getValor().compareTo(paiAtual.getValor()) == -1) {
					paiAtual.setMenor(substituto);
				} else {
					paiAtual.setMaior(substituto);
				}
			} else {
				this.raiz = substituto;
				paiSubstituto.setMenor(null);
				this.raiz.setMaior(paiSubstituto);
				this.raiz.setMenor(atual.getMenor());
			}
			
			if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
				paiSubstituto.setMenor(null);
				substituto.setMaior(paiSubstituto);
			} else {
				paiSubstituto.setMaior(null);
			}
		} else if(atual.getMenor() != null) {
			No<T> substituto = atual.getMenor();
			No<T> paiSubstituto = atual;
			while(substituto.getMaior() != null) {
				paiSubstituto = substituto;
				substituto = substituto.getMaior();
			}
			if(paiAtual != null) {
				if(atual.getValor().compareTo(paiAtual.getValor()) == -1) {
					paiAtual.setMenor(substituto);
				} else {
					paiAtual.setMaior(substituto);
				}
			} else {
				this.raiz = substituto;
			}
			
			if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
				paiSubstituto.setMenor(null);
			} else {
				paiSubstituto.setMaior(null);
			}
			} else {
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setMenor(null);
					} else {
						this.raiz = null;
					}
				}
			}
		return true;
	}
}
