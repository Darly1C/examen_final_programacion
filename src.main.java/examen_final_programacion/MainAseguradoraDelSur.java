package examen_final_programacion;

import java.util.Scanner;

public abstract class MainAseguradoraDelSur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		int menuSistema;
		String menuPoliza;

		do {
			System.out.println("########################################");
			System.out.println("ASEGURADORA DEL SUR, elija una opci�n: ");
			System.out.println("1. Ingresar P�liza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar P�liza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SALIR");
			System.out.println("########################################");
			System.out.println();
			menuSistema = tecladoInt.nextInt();

			switch (menuSistema) {
			case 1:
				System.out.println("Elija el tipo de P�liza que desea ingresar");
				System.out.println("a) P�liza General");
				System.out.println("b) Poliza Vip");
				System.out.println("Seleccione una opci�n:");
				menuPoliza = teclado.nextLine();
				
				switch(menuPoliza) {
				
				case "a":
					System.out.println("");
				
				
				}
			}

		} while (menuSistema != 5);

	}

}
