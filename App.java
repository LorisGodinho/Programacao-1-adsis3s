package Dia_17_04_2020;

import Dia_13_04_2020.ValidacoesLoris;

public class App {
	ValidacoesLoris valor = new ValidacoesLoris(16);
	
	public void main() {
		try {
			valor.setRadicandoQuadradoPerfeito(16);
		} catch (RuntimeException ex) {
			
		}
	}
}
