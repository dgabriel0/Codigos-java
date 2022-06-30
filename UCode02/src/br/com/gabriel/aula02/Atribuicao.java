package br.com.gabriel.aula02;

public class Atribuicao {

	public static void main(String[] args) {
			int x = 10; //atribuição
			System.out.println(x);
			
			x += 25; // mesma coisa que x = x + 25;
			System.out.println(x);
			
			// incrementos
			
			int i = 0;
			i++;
			System.out.println(i);
			i--;
			System.out.println(i);
			
			//logicos
			int nrAmarelo = 2, nrVermelho =1;
			boolean suspenso = nrAmarelo == 1 || nrVermelho == 0;
			System.out.println(suspenso);
	}

}
