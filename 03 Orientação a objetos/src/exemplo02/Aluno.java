package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	String nome;
	double nota01, nota02;
	
	// M�todo de m�dia
	double calculoMedia() {
		return (nota01+nota02)/2;
	}
	
	//M�todo de situa��o
	String situa��o() {
		return calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
	}
	
	// M�todo de mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, nome+" est� "+situa��o()+" com media "+calculoMedia());
	}
	
}
