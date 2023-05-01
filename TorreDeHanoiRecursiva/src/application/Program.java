package application;

import java.util.Scanner;

import util.TowerOfHanoi;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TowerOfHanoi torre = new TowerOfHanoi();

		System.out.println("Digite a quantidade de discos: ");
		int quantidade = sc.nextInt();
		sc.close();


		long startTime = System.currentTimeMillis();

		// Chamada do método
		long movimentos = torre.moverDiscos(quantidade, 'A', 'B', 'C');
		System.out.println("Quantidade de movimentos: "+movimentos);

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;

		long hours = (elapsedTime / (1000 * 60 * 60)) % 24;
		long minutes = (elapsedTime / (1000 * 60)) % 60;
		long seconds = (elapsedTime / 1000) % 60;
		long milliseconds = elapsedTime % 1000;

		String formattedTime = String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds);
		System.out.println("Tempo de execução: " + formattedTime);

	}

}
