package jsnacks;

import java.util.Random;

public class JSnack4 {
	public static void main (String[] args) {
		
		int[] array = new int[10];
		
		int somma=0;
		
		Random numeri = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = numeri.nextInt(100);
			System.out.print(array[i] +"");
		}
		
		for (int i = 0; i < array.length; i++) {
			somma+= array[i];
		}
		System.out.println(somma);
	}

}
