package exemplo02;

public class pessoa extends colaborador {
	
	// Atributos
	private String nome, endereco;
	private int idade;
	
	// Construtor
	public pessoa(String nome, int idade, String endereco, String cargo, double salario) {
		super (cargo, salario);
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;

		
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
