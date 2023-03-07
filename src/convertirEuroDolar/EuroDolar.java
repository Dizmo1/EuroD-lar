package convertirEuroDolar;

import java.util.Scanner;

public class EuroDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double EURODOLAR=1.45;
		double euro,dolar;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la cantidad de euros: ");
		euro=entrada.nextDouble();
	    dolar=euro*EURODOLAR;
	    String resultado = Double.toString(dolar);
		System.out.println(euro+" euros son un total de "+resultado+" dólares canadienses");
		entrada.close();		
		
	}

}
