package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	
	// M�todos
	void apresentacao (){
	JOptionPane.showMessageDialog(null, "Ol�, meu nome �"+nome);	
		
	}
	
	void verificarIdade() {
		JOptionPane.showMessageDialog(null, idade >= 18 ? "Maior de idade" : "Menor de idade");
	}
	
}
