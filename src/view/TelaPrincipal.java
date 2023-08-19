package view;

import javax.swing.JOptionPane;

import controller.jogo;

public class TelaPrincipal {

	public static void main(String[] args) {

		jogo jogo = new jogo();
		JOptionPane.showMessageDialog(null, jogo.IniciaJogo());

	}

}
