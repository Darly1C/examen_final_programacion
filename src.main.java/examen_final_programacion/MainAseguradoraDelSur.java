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
			System.out.println("ASEGURADORA DEL SUR, elija una opción: ");
			System.out.println("1. Ingresar Póliza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar Póliza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SALIR");
			System.out.println("########################################");
			System.out.println();
			menuSistema = tecladoInt.nextInt();

			switch (menuSistema) {
			case 1:
				System.out.println("Tipo de Pólizas");
				System.out.println("a) Póliza General");
				System.out.println("b) Poliza Vip");
				System.out.println("Seleccione una opción:");
				menuPoliza = teclado.nextLine();
				System.out.println();

				switch (menuPoliza) {

				case "a":
					for(int i = 0; i < listPoliza.size(); i++) {
					PolizaCliente cliente = new PolizaCliente();
					System.out.print("Ingrese su nombre: ");
					String nombre = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese descripción: ");
					String descripcion = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese Año Vigencia: ");
					String anioVigencia = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese Código de Póliza: ");
					String codigoPoliza = teclado.nextLine();
					System.out.println();
					System.out.print("Ingrese valor de Póliza: ");
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
