package es.studium.compara;

import java.util.Scanner;

public class compara
{

	public static void main(String[] args)
	{
	int numero1, numero2;
	//Creamos el objeto Scanner conectado al teclado
	Scanner teclado = new Scanner(System.in);
	System.out.println("Dame un n�mero entero: ");
	numero1 = teclado.nextInt();
	System.out.println("Dame otro n�mero entero: ");
	numero2 = teclado.nextInt();
	teclado.close();
	if(numero1==numero2) 
	{	
		System.out.println("Los n�meros son iguales");
	}
	else
	{	
		if(numero1>numero2)	
		{
			System.out.println("El n�mero1 es mayor que el n�mero2");		
		}
		else
		{	
			System.out.println("El n�mero2 es mayor que el n�mero1");
		}
	
		}	
	}	
}
