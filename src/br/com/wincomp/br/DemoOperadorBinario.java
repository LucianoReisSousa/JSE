package br.com.wincomp.br;

public class DemoOperadorBinario {

	public static void main(String[] args) {

		int x = 13;
		int r = 0;
		String b = "";
		
		System.out.println("x: " + x);
		b = Integer.toBinaryString(x);
		System.out.println("b: "+ b);
		System.out.println("Conferindo: " + Integer.parseInt(b, 2));
	}

}
