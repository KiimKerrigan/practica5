package com.cip.prog;
import java.util.Scanner;

public class practica5 {
	//M�todo que devuelve un n�mero aleatorio entre 1 y 100
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
			System.out.print("Introduce n�mero entre 1 y 100: ");
			numero_pantalla = sc.nextInt();	
			intentos++;
			if(numero_aleatorio>numero_pantalla) {
				System.out.println("El n�mero es mayor que "+numero_pantalla);
				
			}else if(numero_pantalla>numero_aleatorio){
				System.out.println("El n�mero es menor que "+numero_pantalla);
								
			}else if(numero_pantalla==numero_aleatorio){
				System.out.println("�Felicidades! has acertado el n�mero, has utilizado "+intentos+" intentos");
			}		
			
		}
			
		}

}
