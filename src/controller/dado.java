package controller;

public class dado {

	static int jogada;

	public static int LançarDado() {
		return jogada = (int) (Math.random() * 6) + 1;
	}

}
