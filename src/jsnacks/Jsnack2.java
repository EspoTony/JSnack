package jsnacks;

//Chiedi all'utente di inserire un numero
//se � pari stampa
//se � dispari stampa il successivo

import java.util.Scanner;

public class Jsnack2 {
	public static void main (String [] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		int valore = numero.nextInt();
		
		numero.close();
		
		if (valore%2==0) {
			System.out.println(valore);
		} else System.out.println(valore+1);
		
		
	}
}