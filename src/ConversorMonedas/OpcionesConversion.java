package ConversorMonedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	  public static String EliminarNotaciónCientifica(double Número) {

	       return new DecimalFormat("#.####################################").format(Número);

	   }
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sur-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a Dólar": 
		monedas.ConvertirPesosColombianoDolares(valor);
		break;
	
	case "De Pesos a Euro": 
		monedas.ConvertirPesosColombianoEuros(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		monedas.ConvertirPesosColombianoLibra(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		monedas.ConvertirPesosColombianoYen(valor);
		break;
		
	case "De Pesos a Won sur-coreano":
		monedas.ConvertirPesosColombianoWon(valor);
		break;
	
	case "De Dólar a Pesos":
		monedas.ConvertirDolaresPesosColombiano(valor);
		break;
		
	case "De Euro a Pesos":
		monedas.ConvertirEurosPesosColombiano(valor);
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.ConvertirLibraPesosColombiano(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		monedas.ConvertirYenPesosColombiano(valor);
		break;
		
	case "De Won sur-coreano a Pesos":
		monedas.ConvertirWonPesosColombiano(valor);
		break;
	}
	}

}
