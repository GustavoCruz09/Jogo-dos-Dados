package controller;

import javax.swing.JOptionPane;

public class jogo {

	static int jogada1, jogada2;

	public static String IniciaJogo() {
		dado dado = new dado();
		String rodada = "";

		for (int i = 0; i < 2; i++) {
			jogada1 = dado.LançarDado();
			jogada2 = dado.LançarDado();

			if (jogada1 + jogada2 == 7) {
				return rodada = "Voce ganhou os dados " + jogada1 + " e " + jogada2 + " somam 7";
			} else if (i == 0) {
				JOptionPane.showMessageDialog(null, "Voce perdeu os dados " + jogada1 + " e " + jogada2
						+ " não somam 7, mas você tem uma nova chance");
			}
		}
		return rodada = "Voce perdeu os dados " + jogada1 + " e " + jogada2 + " não somam 7";

	}

}
