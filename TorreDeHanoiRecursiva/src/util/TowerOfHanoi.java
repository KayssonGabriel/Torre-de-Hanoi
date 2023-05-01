package util;

public class TowerOfHanoi {

	public long moverDiscos(int n, char torreOrigem, char torreAuxiliar, char torreDestino) {
		if (n < 0 || n >= Long.SIZE) {
			throw new IllegalArgumentException("A quantidade de discos deve estar entre 0 e 63.");
		}
		if (n == 0) {
			return 0;
		}
		long movimentos = 0;
		if (n == 1) {
//			System.out.println("Mover disco 1 de " + torreOrigem + " para " + torreDestino);
			movimentos++;
		} else {
			movimentos += moverDiscos(n - 1, torreOrigem, torreDestino, torreAuxiliar);
//			System.out.println("Mover disco " + n + " de " + torreOrigem + " para " + torreDestino);
			movimentos++;
			movimentos += moverDiscos(n - 1, torreAuxiliar, torreOrigem, torreDestino);
		}
		return movimentos;
	}
}
