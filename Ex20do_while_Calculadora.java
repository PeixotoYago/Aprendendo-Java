package excript;

import java.util.Scanner;

public class Ex20do_while_Calculadora {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x = 0;
		double num1, num2, resultado;

		do {

			num1 = num2 = resultado = 0;

			System.out.println(" 1 para somar.");
			System.out.println(" 2 para subtrair.");
			System.out.println(" 3 para multiplicar.");
			System.out.println(" 4 para dividir.");
			System.out.println(" 0 para sair.");
			System.out.println(" Digite a operação que deseja.");

			x = in.nextInt();// pegar o valor digitado pelo usuario e armazenar
								// em x.

			if ((x != 1) && (x != 2) && (x != 3) && (x != 4) && (x != 0)) {
				System.out.println("VOCÊ NÃO SELECIONOU NEM UMA FUNÇÃO.");
				System.out.println();

			} else {
				if (x == 0) {
					System.out.println("VOCÊ SAIU DAS OPERAÇÕES.");

				} else {
					System.out.println("Digite o primeiro numero:");
					num1 = in.nextDouble();

					System.out.println("Digite o Segundo numero:");
					num2 = in.nextDouble();

					if (x == 1) {
						resultado = num1 + num2;

					} else {
						if (x == 2) {
							resultado = num1 - num2;

						} else {
							if (x == 3) {
								resultado = num1 * num2;

							} else {
								if (x == 4) {
									resultado = num1 / num2;
								}
							}
						}
					}
					System.out.println();
					System.out.println("O resultado é: " + resultado);
					System.out.println("---------------------------------");
					System.out.println();
				}
			}
		} while (x != 0);// enquanto não for digitato 0 o programa vai ficar
							// rodando.(enquanto x for diferente de 0).
	}
}
