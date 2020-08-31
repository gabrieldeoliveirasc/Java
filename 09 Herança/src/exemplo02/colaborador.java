package exemplo02;

public class colaborador {

	// Atributos
	protected String cargo;
	protected double salario;

	// Construtor
	public colaborador(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	// Retornar o I.R
	protected double ir() {
		return salario >= 2000 ? salario * 0.1 : salario * 0.05;
	}

	// Exibir os sados do colaborados
	protected void exibirC() {
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário: "+salario);
	}
	
	
}
