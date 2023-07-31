package application;

import java.util.Locale;
import java.util.Scanner;

import studante.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("1 - Começar o software | 2 - Informações do software: ");
		Integer menuInicial = sc.nextInt();
		
		if(menuInicial.equals(1)) {

			estudante.nome = sc.next();
			estudante.nota1 = sc.nextDouble();
			estudante.nota2 = sc.nextDouble();
			estudante.nota3 = sc.nextDouble();
			
			System.out.println();
			System.out.println(estudante);
			
			if(estudante.notaTotal() < 60.0) {
				System.out.println("Aluno(a) reprovado(a).");
				System.out.printf("Falta %.2f Pontos%n", estudante.validacaoNota());
				
			} else {
				System.out.println("Aluno(a) aprovado(a)");
				
			}
			
			
		} else if(menuInicial.equals(2)) {
			System.out.println();
			System.out.println("Você precisa digitar o nome do(a) aluno(a) e as 3 notas para saber se o aluno(a) passou de ano");
			System.out.println("O(A) aluno(a) tem que ter no mínimo 60.0 pontos");
			System.out.println("Exemplo...");
			System.out.println("Luan");
			System.out.println("20");
			System.out.println("30");
			System.out.println("0");
			
		} else {
			System.out.println();
			System.out.println("Você só pode digitar 1 para começar o software ou 2 para saber as informações do software.");
			
		}
		
		sc.close();
	}
}
