package Dia_13_04_2020;

import java.util.Calendar;

public class Exemplo {
	private String nome;
	private int anoDeNascimento;
	private boolean graduacao;

	// 2.1 Um construtor padr�o;
	public Exemplo() {
		nome = null;
		anoDeNascimento = 321;
		graduacao = false;
	}

	// 2.2 Um construtor alternativo;
	public Exemplo(String nome, int anoDeNascimento) {
		setNome(nome);
		setAnoDeNascimento(anoDeNascimento);

	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	// 2.4 Um m�todo de acesso cujo retorno seja o valor de um atributo;
	public boolean isGraduado() {
		return graduacao;
	}

	// 2.3 Um m�todo modificador;
	public void setAnoDeNascimento(int anoDeNascimento) {
		if (Calendar.getInstance().get(Calendar.YEAR) - anoDeNascimento < 17) {
			throw new RuntimeException("A idade deve ser maior que 17");
		} else
			this.anoDeNascimento = anoDeNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// 2.5 Um m�todo de acesso cujo retorno N�O seja o valor de um atributo, mas sim
	// um valor CALCULADO em fun��o de um valor de atributo.;
	public int getIdade() {
		return calcularIdade();
	}

	// 2.6 Um m�todo encapsulado que seja usado pelo m�todo de acesso do item 2.5.
	private int calcularIdade() {
		return Calendar.getInstance().get(Calendar.YEAR) - anoDeNascimento;
	}
}
