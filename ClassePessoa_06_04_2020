package aula20200406.tiposDeMetodos;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	//Elaborar tambem um construtor para a classe Pessoa que receba os valores iniciais de seus atributos (nome, idade, peso e altura).
	public Pessoa() {
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
	}
	
	
	public double getIMC() {
		return peso / (altura * altura);
	}

	// Olha um getter aqui!
	public String getNome() {
		return this.nome;
	}

	// Olha um setter aqui!
	public void setNome(String nome) {
		if (this.nome.length() < 1 || this.nome == null) {
			//nao consegui usar o throw new runtimeException (ativem o log kk)
			System.out.println(" O nome esta nulo ou muito curto  ");
		} else {
			this.nome = nome;
		}
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		if (this.altura < 25) {
			//nao consegui usar o throw new runtimeException (ativem o log kk)
			System.out.println(" A altura precisa ser maior que 25cm  ");
		}
		else {
			this.altura = altura;
		}

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new RuntimeException("Peso deve ser maior que zero!");
		}
		this.peso = peso;
	}

}
