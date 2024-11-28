package com.generation;

import java.util.Scanner;//se importa scanner

public class Codigo4 {
	private String jugador1;
    private String jugador2;

	public static void main(String[] args) {
		Codigo4 juego1 = new Codigo4();
        juego1.jugar();

	}
	public void jugar() {//se crea el metodo jugar
		Scanner scan=new Scanner(System.in);//solo se crea un scanner y se agrega System.in
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		jugador1=scan.nextLine().toLowerCase();
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		jugador2=scan.nextLine().toLowerCase();
		 if (jugador1.equals(jugador2)) {
	            System.out.println("Empate");
	        } else {
	        int g = 2;
	       switch (jugador1) {
	                case "piedra":
	                    if (jugador2.equals("tijeras")) {
	                        g = 1;
	                    }
	                    break;//se agrega el break
	                case "papel":
	                    if (jugador2.equals("piedra")) {
	                        g = 1;
	                    }//se agrega }
	                    break;
	                case "tijeras":
	                    if (jugador2.equals("papel")) {
	                        g = 1;
	                    }
	                    break;
	                default:
	                    System.out.println("Elección inválida");//se agrega msj si la opcion no esta en switch
	                    return;
	            }
	       System.out.println("Gana el jugador " + g);
	        }
		 scan.close(); // Cerramos el Scanner
	}//cierre de jugar

}//cierre de clase
