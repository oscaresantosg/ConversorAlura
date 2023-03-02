package ConversorMonedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public static String EliminarNotaciónCientifica(double Número) {

	    return new DecimalFormat("#.##############################").format(Número);

	   }
	
	public void ConvertirPesosColombianoDolares(double valor) {
		double monedaDolar = valor * 0.00021;
		String temporalDolares = String.valueOf(monedaDolar);
		temporalDolares = EliminarNotaciónCientifica(monedaDolar);
		JOptionPane.showMessageDialog(null, "Tienes $ " + temporalDolares + " Dolares");
	}
	public void ConvertirPesosColombianoEuros(double valor) {
		double monedaEuro = valor / 5172.87;
		String temporalEuro = String.valueOf(monedaEuro);
		temporalEuro = EliminarNotaciónCientifica(monedaEuro);
		JOptionPane.showMessageDialog(null, "Tienes $ " + temporalEuro + " Euros");
	}
	public void ConvertirPesosColombianoLibra(double valor) {
		double monedaLibra = valor / 5829.09;
		String temporalLibra = String.valueOf(monedaLibra);
		temporalLibra = EliminarNotaciónCientifica(monedaLibra);
		JOptionPane.showMessageDialog(null, "Tienes $ " + temporalLibra + " Libras Esterlinas");
		
	}
	public void ConvertirPesosColombianoYen(double valor) {
		double monedaYen = valor / 35.60;
		monedaYen = (double)Math.round(monedaYen * 100000d) /100000 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirPesosColombianoWon(double valor) {
		double monedaWon = valor / 3.71;
		monedaWon = (double)Math.round(monedaWon * 100000d) /100000 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	
	public void ConvertirDolaresPesosColombiano(double valor) {
		double monedaDolar = 4848.28 * valor;						//
		monedaDolar = (double)Math.round(monedaDolar * 10000d) /10000 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertirEurosPesosColombiano(double valor) {
		double monedaEuro = valor * 5172.87;							//
		monedaEuro = (double)Math.round(monedaEuro * 10000d) /10000 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	public void ConvertirLibraPesosColombiano(double valor) {
		double monedaLibra = valor * 5829.09;						//
		monedaLibra = (double)Math.round(monedaLibra * 100000d) /100000 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	public void ConvertirYenPesosColombiano(double valor) {
		double monedaYen = valor * 35.60;								// 
		monedaYen = (double)Math.round(monedaYen * 100000d) /100000 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}
	public void ConvertirWonPesosColombiano(double valor) {
		double monedaWon = valor * 3.71;								// 
		monedaWon = (double)Math.round(monedaWon * 100000d) /100000 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sur-coreano " + monedaWon + " en pesos");
	}

}
