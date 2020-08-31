package exercicio01;

public class IMC {

	// Construtor
	public IMC(double peso, double altura) {
		System.out.println(peso+" "+altura+" "+calculoIMC( peso,  altura)+" "+situacaoIMC(calculoIMC( peso,  altura)));
		
		double imc = calculoIMC(peso, altura);
	}
	
	
	// Método calculo IMC
	private double calculoIMC(double peso, double altura) {
		return altura * altura / peso;
	}
	
	
	
	
	// Método para exibir situação
	
	private String situacaoIMC(double imc) {
		String situacao;
		
		if (imc <= 18.5) {
			situacao=("Abaixo do peso");
		}else if (imc <= 25) {
			situacao=("Peso normal");
		}else if (imc <=30) {
			situacao=("Acima do peso");
		}else {
			situacao=("Obeso");
		}
		
		return situacao;
	}
	
	
	
	
}
