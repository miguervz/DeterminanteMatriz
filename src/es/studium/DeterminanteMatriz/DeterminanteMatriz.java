package es.studium.DeterminanteMatriz;

import java.util.Scanner;

public class DeterminanteMatriz {

	public static void main(String[] args) {
		int tabla[][] = new int[3][3];
		int determinante, a,b,c,e,f,g;
		
		int i,j;
		Scanner teclado = new Scanner(System.in);
		for( i=0;i<3;i++)
		{
		for( j=0;j<3;j++)
		{
		System.out.println("Ingrese el valor de la posición "+i+","+j);
		
		tabla[i][j] = teclado.nextInt();
		}}
		
		
		a=tabla[0][0]*tabla[1][1]*tabla[2][2];
		b=tabla[0][1]*tabla[1][2]*tabla[2][0];
		c=tabla[0][2]*tabla[1][0]*tabla[2][1];
		e=tabla[0][2]*tabla[1][1]*tabla[2][0];
		f=tabla[0][0]*tabla[1][2]*tabla[2][1];
		g=tabla[0][1]*tabla[1][0]*tabla[2][2];
		
		determinante=((a+b+c)-(e+f+g));
		
		
		System.out.println("El determinante es: " +determinante);
		teclado.close();
}
}