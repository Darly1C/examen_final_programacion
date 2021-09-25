package examen_final_programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MainAseguradoraDelSur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		int menuSistema;
		String menuPoliza;

		List<PolizaCliente> listPoliza = new ArrayList<PolizaCliente>();
		List<PolizaGeneral> listGeneral = new ArrayList<PolizaGeneral>();
		List<PolizaVip> listVip = new ArrayList<PolizaVip>();
		
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
				System.out.println("Tipo de P�lizas");
				System.out.println("a) P�liza General");
				System.out.println("b) Poliza Vip");
				System.out.println("Seleccione una opci�n:");
				menuPoliza = teclado.nextLine();
				System.out.println();

				switch (menuPoliza) {

				case "a":
					for(int i = 0; i < listPoliza.size(); i++) {
					PolizaCliente cliente = new PolizaCliente();
					System.out.print("Ingrese su nombre: ");
					String nombre = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese descripci�n: ");
					String descripcion = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese A�o Vigencia: ");
					String anioVigencia = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese C�digo de P�liza: ");
					String codigoPoliza = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese valor de P�liza: ");
					int valorPoliza = tecladoInt.nextInt();
					System.out.println();
					
					cliente.setNombre(nombre);
					cliente.setDescripcion(descripcion);
					
					}

				}
			}

		} while (menuSistema != 5);

	}

}
