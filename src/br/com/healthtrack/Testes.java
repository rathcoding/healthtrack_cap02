package br.com.healthtrack;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Testes {

	public static void main(String[] args) throws ParseException {
		
		PesoDAO pesoDAO = new PesoDAO();

		Double quilos = 50.0;
		Date data = new Date();
		
		for (int i = 0; i < 10; i++) {
			quilos *= 0.99;
			RegPeso peso = new RegPeso(i, data, quilos);
			pesoDAO.cadastrar(peso);
			data = new Date(data.getTime() + (1000 * 60 * 60 * 24));
		}
		
		List<RegPeso> pesos = pesoDAO.getAll();
		
		System.out.println( "id | data | peso");

		for (RegPeso reg: pesos) {
			System.out.println(reg.toString());			
		}
		
	}
	
	
	
}
