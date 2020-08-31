package exercicio01;

public class Colaborador {

	String cargo;
	double salario;
	int faltas;
	
	public Colaborador(String cargo, double salario, int faltas) {
		this.cargo = cargo;
		this.salario = salario;
		this.faltas = faltas;
		exibirDadosColaborador();
	}
	
	private void exibirDadosColaborador() {
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário: "+salario);
		System.out.println("Faltas: "+faltas);
	}
	
	private double premiosFalta() {
		return faltas == 0 ? 100 : 0;
	}
	
	private double impostoRenda() {
		double ir;
		
		if(salario <= 1000) {
			ir = 0;
		}else if(salario <= 2500) {
			ir = salario * 0.05;
		}else {
			ir = salario * 0.1;
		}
		return ir;
	}
	
	private double valeTransporte() {
		return salario > 0 ? salario * 0.06 : 0;
	}
	
	private double valeRefeicao() {
		return salario <= 2000 ? salario * 0.05 : salario * 0.1;
	}
	
	
	
}
