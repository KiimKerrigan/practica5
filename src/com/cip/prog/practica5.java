package com.cip.prog;
import java.util.Scanner;

public class practica5 {
	//Método que devuelve un número aleatorio entre 1 y 100
	public static int generaNumeroAleatorio(){
        
	       int num=(int)(Math.random()*100)+1;
	       return num;
	   }
	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);
		
		int numero_aleatorio= generaNumeroAleatorio();
		int intentos=0;	
		int numero_pantalla=0;

		while(numero_pantalla!=numero_aleatorio){
			System.out.print("Introduce número entre 1 y 100: ");
			numero_pantalla = sc.nextInt();	
			intentos++;
			if(numero_aleatorio>numero_pantalla) {
				System.out.println("El número es mayor que "+numero_pantalla);
				
			}else if(numero_pantalla>numero_aleatorio){
				System.out.println("El número es menor que "+numero_pantalla);
								
			}else if(numero_pantalla==numero_aleatorio){
				System.out.println("¡Felicidades! has acertado el número, has utilizado "+intentos+" intentos");
			}		
			
		}
			
		}

}
