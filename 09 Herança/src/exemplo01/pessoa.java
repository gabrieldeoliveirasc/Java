package exemplo01;

public class pessoa extends colaborador {
	
	// Atributos
	private String nome, endereco;
	private int idade;
	
	// Construtor
	public pessoa(String nome, int idade, String endereco, String cargo, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
		
		exibirP();
		exibirC();
		System.out.println("Imposto de renda R$ "+ir());
	}

	// Exibir os dados da Pessoa
	private void exibirP() {
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("Endereço: "+endereco);
	}
	
}
