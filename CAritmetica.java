package com.cip.prog.actividad3;

import java.util.Scanner;

public class CAritmetica {
		/*
		* Operaciones aritméticas
		*/
		public static void main (String[] args)
		{
			int datol, dato2, dato3, resultado;
			datol = 20;
			dato2 = 10;
			
			//Se crea el lector
			Scanner sc = new Scanner(System.in);
			//Se pide un número
			System.out.print("Introduce el 3er dato : ");
			//Se lee el número con nextFloat() que retorna un número flotante con el dato
				dato3 = sc.nextInt();
				
			// Suma
			resultado = datol + dato2 + dato3;
			System.out.println(datol + " + " + dato2 + " + " + dato3 + " = " + resultado);
			
			// Resta
			resultado = datol - dato2 - dato3;
			System.out.println(datol + " - " + dato2 + " - " + dato3 + " = " + resultado);
			
			// Producto
			resultado = datol * dato2;
			System.out.println(datol + " * " + dato2 + " * " + dato3 + " = " + resultado);
			
			// Cociente
			resultado = datol / dato2;
			System.out.println(datol + " / " + dato2 + " / " + dato3 + " = " + resultado);
			
			//Cerramos el sc
			sc.close();
			}
		}
