package exercicio01;

public class Pessoa extends Colaborador {
	
	String nome;
	int idade;
	String cidade;
	String bairro;
	String rua;
	int numero;
	String complemento;
	
	public Pessoa(String nome, int idade, String cidade, String bairro, String rua, int numero, String complemento, String cargo, double salario, int faltas ) {
		super(cargo, salario, faltas);
	
	this.nome = nome;
	this.idade = idade;
	this.cidade = cidade;
	this.bairro = bairro;
	this.rua = rua;
	this.numero = numero;
	this.complemento = complemento;	
	
	exibirDadosPessoa();
	}
	
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Cidade: "+cidade);
		System.out.println("Bairro: "+bairro);
		System.out.println("Rua: "+rua);
		System.out.println("Número: "+numero);
		System.out.println("Complemento :"+complemento);
	}
}
