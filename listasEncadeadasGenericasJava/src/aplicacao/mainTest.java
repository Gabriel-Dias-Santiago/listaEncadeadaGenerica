package aplicacao;

import java.util.Scanner;

import Lista.ListaCrescenteInt;

public class mainTest {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);	
		ListaCrescenteInt lista = new ListaCrescenteInt();
		
		System.out.println("positivo para add e negativo para encerrar ");
		int valor = le.nextInt();
		
		
		while (valor >= 0) {	
			lista.add(valor);
			System.out.print("positivo para add e negativo para encerrar ");
			valor = le.nextInt();	
			lista.show();
		}
		
		
		le.close();
	}

}
