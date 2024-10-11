public class ConversorMoeda implements ConversaoFinanceira {
	
	   @Override
	    public void converterDolarParaReal(double valorDolar) {
	        double cotacaoDolar = 4.80;
	        double valorReal = valorDolar * cotacaoDolar;
	        System.out.println("O valor em reais é: R$" + valorReal);
	    }
	}
