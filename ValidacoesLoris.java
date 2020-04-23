package Dia_17_04_2020;

public class ValidacoesLoris {
	private int radicando;

	public ValidacoesLoris(int valor) {
		this.radicando = valor;
	}

	public int getRadicando() {
		return radicando;
	}
	
	public boolean isInteiro(double valor) {
		return ((int)valor == valor);
	}

	public void setRadicandoQuadradoPerfeito(int valor) {
		if ( isInteiro( Math.sqrt(valor) ) == true ) {
			this.radicando = valor;
		}
		else {
			throw new RuntimeException("O valor não é um quadrado perfeito");
		}

	}

}
