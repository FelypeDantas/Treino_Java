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

	public int altura(No<T> atual){
		if(atual == null){
			return -1;
		}
		if(atual.getMaior() == null && atual.getMenor() == null) {
			return 0;
		} else if(atual.getMenor() == null) {
			return 1 + altura(atual.getMaior());
		} else if(atual.getMaior() == null) {
			return 1 + altura(atual.getMenor());
		} else {
			if(altura(atual.getMenor()) > altura(atual.getMaior())) {
				return 1 + altura(atual.getMenor());
			} else {
				return 1 + altura(atual.getMaior());
			}
		}
	}

	public void defineBalanceamento(No<T> atual){
		atual.setBalabanceamento(altura(atual.getMenor()) - altura(atual.getMaior()));

		if (atual.getMaior() != null){
			defineBalanceamento(atual.getMaior());
		}
		if (atual.getMenor() != null) {
			defineBalanceamento(atual.getMenor());
		}
	}

	public No<T> rotacaoEsquerda(No<T> atual) {
		No<T> aux = atual.getMaior();
		aux.setRaiz(atual.getRaiz());

		if(aux.getMenor() != null){
			aux.getMenor().setRaiz(atual);
		}
		atual.setRaiz(aux);
		atual.setMaior(aux.setMenor());
		aux.setMenor(atual);

		if (aux.getRaiz() != null){
			if(aux.getRaiz().getMaior() == atual) {
				aux.getRaiz().setMaior(aux);
			} else if(aux.getRaiz().getMenor() == atual){
				aux.getRaiz().setMenor(aux);
			}
		}
		defineBalanceamento(aux);
		return aux;
	}

	public No<T> rotacaoDireita(No<T> atual){
		No<T> aux = atual.getMenor();
		aux.setRaiz(atual.getRaiz());

		if (aux.getMaior() != null) {
			aux.getMaior().setRaiz(atual);
		}
		atual.setRaiz(aux);
		atual.setMenor(aux.getMaior());
		aux.setMaior(atual);
		if(aux.getRaiz() != null){
			if(aux.getRaiz().getMaior() == atual) {
				aux.getRaiz().setMaior();
			} else if(aux.getRaiz().getMenor() == atual) {
				aux.getRaiz().setMenor(aux);
			}
		}
		defineBalanceamento(aux);
		return aux;
	}

	public No<T> rotacaoDuplaDireita(No<T> atual){
		No<T> aux = atual.getMenor();
		atual.setMenor(rotacaoEsquerda(aux));
		No<T> aux2 = rotacaoDireita(atual);
		return aux2;
	}

	public No<T> rotacaoDuplaEsquerda(No<T> atual) {
		No<T> aux = atual.getMaior();
		atual.setMaior(rotacaoDireita(aux));
		No<T> aux2 = rotacaoEsquerda(atual);
		return aux2;
	}

	public void balancear() {
		this.raiz = balancear(this.raiz);
	}

	public No<T> balancear(No<T> atual) {
		if(atual.getBalanceamento() == 2 && atual.getMenor().getBalanceamento() >= 0){
			atual = rotacaoDireita(atual);
		} else if(atual.getBalanceamento() == -2 && atual.getMaior().getBalanceamento() <= 0){
			atual = rotacaoEsquerda(atual);
		} else if(atual.getBalanceamento() == 2 && atual.getMenor().getBalanceamento() < 0) {
			atual = rotacaoDuplaDireita(atual);
		} else if (atual.getBalanceamento() == -2 && atual.getMaior().getBalanceamento() > 0) {
			atual = rotacaoDuplaEsquerda(atual);
		}
		
		if (atual.getMaior() != null){
			balancear(atual.getMaior());
		}
		if (atual.getMenor() != null) {
			balancear(atual.getMenor());
		}
		return atual;
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
	
	public boolean remove(No<T> valor) {
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

	public boolean remove(T valor) {
		this.raiz = removeRecursivo(this.raiz, valor);
		return true;
	}

	private No<T> removeRecursivo(No<T> atual, T valor) {
		if (atual == null) return null;

		if (valor.compareTo(atual.getValor()) < 0) {
			atual.setMenor(removeRecursivo(atual.getMenor(), valor));
		} else if (valor.compareTo(atual.getValor()) > 0) {
			atual.setMaior(removeRecursivo(atual.getMaior(), valor));
		} else {
			if (atual.getMenor() == null && atual.getMaior() == null) {
				atual = null; 
			} else if (atual.getMenor() == null) {
				atual = atual.getMaior(); 
			} else if (atual.getMaior() == null) {
				atual = atual.getMenor(); 
			} else {
				No<T> substituto = encontrarMinimo(atual.getMaior());
				atual.setValor(substituto.getValor());
				atual.setMaior(removeRecursivo(atual.getMaior(), substituto.getValor()));
			}
		}

		atual = balancear(atual);
		return atual;
	}

	private No<T> encontrarMinimo(No<T> atual) {
		while (atual.getMenor() != null) {
			atual = atual.getMenor();
		}
		return atual;
	}

}
