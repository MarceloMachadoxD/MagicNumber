package entities;

public class Fundo {

	public String nome;
	public double valorFundo, rentMensal;

	public Integer magicNumber() {
		// calcula o número minimo de ações para recompra mensal de uma nova ação

		int magicN = 0;

		for (int c = 1; c * rentMensal <= valorFundo; c++) {

			magicN = c + 1;
		}

		return magicN;

	}

}
