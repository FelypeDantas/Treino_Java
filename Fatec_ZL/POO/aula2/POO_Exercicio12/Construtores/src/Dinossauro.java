
public class Dinossauro {
	int energia = 10;
	int velocidade = 10;
	double temperatura = 36.00;
	boolean humor = false;
	
	public void pular(int energia, int velocidade, boolean humor) {
		if(energia > 0 || velocidade > 0) {
			energia -= 1;
			velocidade -= 1;
			humor = true;
			if(humor) {
				System.out.println("Estou feliz");
			}
			System.out.println("Pulando...");
		} else {
			System.out.println("Estou esgotado");
		}
	}
	
	public void correr(int energia, int velocidade, boolean humor) {
		humor = true;
		if(humor) {
			System.out.println("Estou feliz");
		}
		if(energia > 0 && velocidade > 0) {
			energia -= 1;
			velocidade -= 1;
			System.out.println("Correndo...");
		} else {
			velocidade = 0;
			energia = 0;
			System.out.println("Estou esgotado");
		}
	}
	
	public void comer(int energia, int velocidade, boolean humor) {
		energia += 2;
		velocidade += 1;
		humor = true ;
		if(humor) {
			System.out.println("Estou feliz");
		}
		System.out.println("Comendo");
	}
	
	public void cantar(int energia, boolean humor) {
		if(energia > 0) {
			energia -= 1;
			humor = true;
			if(humor) {
				System.out.println("Estou feliz");
			}
			System.out.println("Lá lá lá lá");
		} else {
			System.out.println("Estou esgotado");
		}
	}
	
	public void tomarSol(double temperatura, int velocidade, boolean humor) {
		temperatura += 2;
		velocidade += 1;
		humor = true;
		
		if(humor) {
			System.out.println("Estou feliz :)");
		}
		if(temperatura > 38) {
			System.out.println("Estou ficando com febre");
		}
		System.out.println("Tomando sol...");
	}
	
	public void ficarNaSombra(int energia, boolean humor, double temperatura) {
		energia += 10;
		if(temperatura >= 37) {
			temperatura = 36;
		}
		if(!humor) {
			System.out.println("Estou triste");
		}
		System.out.println("Na sombra...");
	}

}
