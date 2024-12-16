import model.No;

public class Hashtable<T>{

	private No<T> vetor[];
	
	@SupressWarnings("unchecked")
	public Hashtable(int tamanho) {
		tabela = (No<T>[]) new No[tamanho];
	}
	
	public void adicionar(int chave, T valor){
		No<T> novoNo = new No<>(chave,valor);
		tabela[tamanho++] = novoNo;
		Arrays.sort(tabela, 0, tamanho);
	}
	
	public T buscar(int chave){
		int inicio = 0;
		int fim = tamanho - 1;
		
		while(inicio <= fim){
			int meio = inicio + (fim - inicio) / 2;
			No<T> noAtual = tabela[meio];
			
			if(noAtual.getChave()== chave){
				return noAtual.getValor();
			} else if(noAtual.getChave() < chave){
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return null;
	}
	
	
	
	
}