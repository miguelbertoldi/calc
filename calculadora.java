package a3011;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x, y, result=0;
		
		for(int opcao=5; opcao!=0; opcao=opcao) {
			System.out.println("=== CALCULADORA ===\n1. Soma \n2. Subtra��o \n3. Multiplica��o \n4. Divis�o\n0. Sair \n===================\n");
			opcao = ler.nextInt();
			if(opcao!=0) {
				System.out.println("Digite o primeiro n�mero: ");
				x = ler.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				y = ler.nextInt();
				
				switch(opcao) {
				case 1:
					result = soma(x, y);
					break;
				case 2:
					result = subtracao(x, y);
					break;
				case 3:
					result = multiplicacao(x, y);
					break;
				case 4:
					result = divisao(x, y);
					break;
				}
				System.out.println("Resultado: " +result +"\n");
			}
		}
	}
	public static double soma(double x, double y) {
		return x+y;
	}
	public static double subtracao(double x, double y) {
		return x-y;
	}
	public static double multiplicacao(double x, double y) {
		return x*y;
	}
	public static double divisao(double x, double y) {
		return x/y;
	}
}
