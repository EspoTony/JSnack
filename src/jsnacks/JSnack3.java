package jsnacks;

//Generatore di nomi e cognomi casuali

import java.util.Random;

public class JSnack3 {
	public static void main(String[] args) {
		
		Random casuale = new Random();
		
		String[] nomi = {"Pippo","Pasquale","Simone"};
	    String[] cognomi = {"Rossi","Andolfo","Merdaccia"};

	    String[] Lista = new String [3];
	    
	    System.out.println("Gli invitati sono: ");
	    
	    for	(int i=0; i<3;i++) {
	    	String nome = nomi[casuale.nextInt(3)];
	    	String cognome = cognomi[casuale.nextInt(3)];
	    			
	    	Lista[i] = nome+" "+cognome;
	    	System.out.println(Lista[i]);
	    }
}
}