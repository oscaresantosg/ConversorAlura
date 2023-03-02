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

				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");

				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
					seguir = true;
					menu();
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado.!");

				}
				if (JOptionPane.CANCEL_OPTION == respuesta) {
					JOptionPane.showMessageDialog(null, "HASTA LUEGO ");
				} else {

				}
				break;

			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {

					System.out.println("Entra");
					seguir = true;
					menu();

				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
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