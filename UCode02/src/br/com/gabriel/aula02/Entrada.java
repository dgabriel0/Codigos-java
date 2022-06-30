package br.com.gabriel.aula02;
import java.util.Scanner;
public class Entrada {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int a, b, soma;
	System.out.println("digite o valor de A: ");
	a= entrada.nextInt();
	System.out.println("digite o valor de b: ");
	b= entrada.nextInt();
	soma = a + b;
	System.out.println("A soma de A + B: " + soma);
	//fechar o scanner
	entrada.close();
 }
}
