package exemplo01;

public class principal {

	public static void main(String[] args) {
		
		// Instanciar um objeto da classe pessoa
		Pessoa objeto = new Pessoa();
		objeto.nome = " Gabriel";
		objeto.idade = 22;
		objeto.apresentacao();
		objeto.verificarIdade();

	}

}
