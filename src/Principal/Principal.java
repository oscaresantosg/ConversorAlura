package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Principal {
	boolean seguir = false;

	OpcionesConversion conversion = new OpcionesConversion();
	OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

	public void menu() {

		do {

			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Conversor de Monedas":
				
				try {			
					String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
					}catch (Exception e) {
						System.out.println("error de ingreso, valores no tienen el formato requerido");
						JOptionPane.showMessageDialog(null, "valores no tienen el formato requerido ");
						}

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");

				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
					seguir = true;
					menu();
				} else if (JOptionPane.CANCEL_OPTION == respuesta){
					JOptionPane.showMessageDialog(null, "Programa finalizado.!");
				} else {
					System.out.println("adios");
					JOptionPane.showMessageDialog(null, "Programa finalizado.");

				}
				break;

			case "Conversor de Temperatura":
				try {
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				}catch (Exception e) {
					System.out.println("error de ingreso, valores no tienen el formato requerido");
					JOptionPane.showMessageDialog(null, "valores no tienen el formato requerido ");
					}

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {

					System.out.println("Entra");
					seguir = true;
					menu();

				} else if( JOptionPane.CANCEL_OPTION == respuestaT) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				} else {
					System.out.println("adios");
					JOptionPane.showMessageDialog(null, "Programa finalizado.");
				}
			}
			break;
		} while (seguir == true);

	}

	public static void main(String[] args) {

		Principal main = new Principal();
		main.menu();
	}
}