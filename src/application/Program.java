package application;

import java.util.Scanner;

import entities.Diferencia;

public class Program {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int A,B,C,D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferencia d = new Diferencia(A, B, C, D);
		
		int x = d.dif(A, B, C, D);
		
		System.out.println("Diferêcia: "+x);
		
		sc.close();
		

	}

}
