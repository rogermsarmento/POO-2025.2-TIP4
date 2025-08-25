package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite sua média: ");
		double media = sc.nextDouble();
		
		String situacao = "";
		
		situacao = (media >= 7)?"Aprovado":"Não Aprovado";
		
		System.out.println("Resultado de " + nome + " foi: " + situacao);

	}
}
