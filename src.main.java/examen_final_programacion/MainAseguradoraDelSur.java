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
		String codigoPoliza = "";

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
					for (int i = 0; i <= 2; i++) {
						PolizaGeneral cliente1 = new PolizaGeneral();

						System.out.print("Ingrese su nombre: ");
						String nombre = teclado.nextLine();
						System.out.print("Ingrese descripci�n: ");
						String descripcion = teclado.nextLine();
						System.out.print("Ingrese A�o Vigencia: ");
						int anioVigencia = tecladoInt.nextInt();
						System.out.print("Ingrese C�digo de P�liza: ");
						codigoPoliza = teclado.nextLine();
						System.out.print("Ingrese valor de P�liza: ");
						int valorPoliza = tecladoInt.nextInt();
						System.out.print("Ingrese c�digo de descuento: ");
						String codigoDescuento = teclado.nextLine();
						System.out.print("Ingrese n�mero de seguro: ");
						String numeroSeguro = teclado.nextLine();

						cliente1.setNombre(nombre);
						cliente1.setDescripcion(descripcion);
						cliente1.setAnioVigencia(anioVigencia);
						cliente1.setCodigoPoliza(codigoPoliza);
						cliente1.setValorPoliza(valorPoliza);
						cliente1.setCodigoDescuento(codigoDescuento);
						cliente1.setNumeroDeSeguro(numeroSeguro);

						listGeneral.add(cliente1);

						System.out.println(cliente1);
					}

					break;

				case "b":

					for (int i = 0; i <= 2; i++) {
						PolizaVip cliente2 = new PolizaVip();

						System.out.print("Ingrese su nombre: ");
						String nombre = teclado.nextLine();
						System.out.print("Ingrese descripci�n: ");
						String descripcion = teclado.nextLine();
						System.out.print("Ingrese A�o Vigencia: ");
						int anioVigencia = tecladoInt.nextInt();
						System.out.print("Ingrese C�digo de P�liza: ");
						codigoPoliza = teclado.nextLine();
						System.out.print("Ingrese valor de P�liza: ");
						int valorPoliza = tecladoInt.nextInt();
						System.out.print("Ingrese beneficio: ");
						String beneficio = teclado.nextLine();

						cliente2.setNombre(nombre);
						cliente2.setDescripcion(descripcion);
						cliente2.setAnioVigencia(anioVigencia);
						cliente2.setCodigoPoliza(codigoPoliza);
						cliente2.setValorPoliza(valorPoliza);
						cliente2.setBeneficio(beneficio);

						listVip.add(cliente2);

						System.out.println(cliente2);

					}

					break;

				}
			case 2:
				System.out.print("Ingrese c�digo de P�liza: ");
				String codigoPoliza2 = teclado.nextLine();
				if(codigoPoliza2.equals(codigoPoliza)){
				System.out.println(codigoPoliza2);
				}
				
				break;
			}

		} while (menuSistema != 5);

	}
}
