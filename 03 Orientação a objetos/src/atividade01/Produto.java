package atividade01;

import javax.swing.JOptionPane;

public class Produto {

	String nome;
	double valor;
	
	// M�todo desconto
	double  calculoDesconto() {
		return valor >= 100 ? valor * 0.9 : valor * 1;
	}
	
	// M�todo de mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, "A "+nome+" custar� "+calculoDesconto());
	}
}
