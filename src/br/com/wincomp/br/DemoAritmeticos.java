package br.com.wincomp.br;

public class DemoAritmeticos {

	public static void main(String[] args) {

		int i = 37;
		int j = 42;
		double x = 27.475;
		double y = 7.22;

		System.out.println("Valores da Variáveis...");
		System.out.println("    i = +i");
		System.out.println("    j = +j");
		System.out.println("    x = +x");
		System.out.println("    y = +y");

		System.out.println("Somando...");
		System.out.println("    i + j=" + (i + j));
		System.out.println("    x + y=" + (x + y));

		System.out.println("Subtraindo...");
		System.out.println("    i - j=" + (i - j));
		System.out.println("    x + y=" + (x - y));

		System.out.println("Multiplicando...");
		System.out.println("    i * j=" + (i * j));
		System.out.println("    x * y=" + (x * y));

		System.out.println("Dividindo...");
		System.out.println("    i / j=" + (i / j));
		System.out.println("    x / y=" + (x / y));

		System.out.println("Calculando o módulo...");
		System.out.println("    i % j=" + (i % j));
		System.out.println("    x % y=" + (x % y));

		System.out.println("Misturando os tipos...");
		System.out.println("    j + y=" + (j + y));
		System.out.println("    i * x=" + (i * x));

	}

}
