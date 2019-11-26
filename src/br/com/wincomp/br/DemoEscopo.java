package br.com.wincomp.br;

public class DemoEscopo {

	String escola = "Wincomp Informática Ltda";

	public static void main(String[] args) {

		String curso = "J2SE";

		try {
			String msg = "Curso: " + curso;
			System.out.println(msg);
		} catch (Exception x) {

			System.out.println(x.getMessage());
		}
	}
}