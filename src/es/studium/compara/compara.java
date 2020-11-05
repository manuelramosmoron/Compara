package es.studium.compara;

import java.util.Scanner;

public class compara
{

	public static void main(String[] args)
	{
	int numero1, numero2;
	//Creamos el objeto Scanner conectado al teclado
	Scanner teclado = new Scanner(System.in);
	System.out.println("Dame un número entero: ");
	numero1 = teclado.nextInt();
	System.out.println("Dame otro número entero: ");
	numero2 = teclado.nextInt();
	teclado.close();
	if(numero1==numero2) 
	{	
		System.out.println("Los números son iguales");
	}
	else
	{	
		if(numero1>numero2)	
		{
			System.out.println("El número1 es mayor que el número2");		
		}
		else
		{	
			System.out.println("El número2 es mayor que el número1");
		}
	
		}	
	}	
}
