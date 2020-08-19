package atividade02;

import javax.swing.JOptionPane;

public class IMC {

	// Variáveis
	double peso;
	double altura;
	
	// Método cálculo IMC
	
	double calculo() {
		return (altura * altura)/peso;
	}
	
	// Método Situação
	
	String situacao() {
	String situacao;
		
		if (calculo() <= 18.5) {
			situacao = "abaixo do peso";
		}else if (calculo() <= 25) {
			situacao = "com o peso normal";
		}else if (calculo() <= 30) {
			situacao = "acima do peso";
		}else {
			situacao = "obeso";
		}
		return situacao;
	}
	
	// Mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, "Você está "+situacao());
	}
	
}
