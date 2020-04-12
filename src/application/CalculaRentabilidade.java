package application;

import java.util.Scanner;

import entities.Fundo;

public class CalculaRentabilidade {

	public static void main(String[] args) {
		int mn = 0;
		double valor = 0;

		Scanner sc = new Scanner(System.in);
		Fundo f = new Fundo();

		System.out.println("Digite o Nome do fundo");
		f.nome = sc.nextLine();

		System.out.println("Digite o Valor unitário do Fundo");

		f.valorFundo = sc.nextDouble();

		System.out.println("Digite o valor de rentabilidade mensal");

		f.rentMensal = sc.nextDouble();

		mn = f.magicNumber();
		System.out.println("O magic number desse fundo é: " + mn);

		System.out.println("O valor mínimo para investimento é: " + (mn * f.valorFundo));

		System.out.println("");

		System.out.println("Digite o valor que deseja investir: ");

		valor = sc.nextDouble();

		System.out.println("O valor investido irá render: " + valor * f.rentMensal + " mensalmente");

		sc.close();

	}

}
