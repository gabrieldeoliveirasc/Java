package atividade02;

import javax.swing.JOptionPane;

public class IMC {

	// Vari�veis
	double peso;
	double altura;
	
	// M�todo c�lculo IMC
	
	double calculo() {
		return (altura * altura)/peso;
	}
	
	// M�todo Situa��o
	
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
		JOptionPane.showMessageDialog(null, "Voc� est� "+situacao());
	}
	
}
