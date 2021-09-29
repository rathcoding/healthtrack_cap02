package br.com.healthtrack;

import java.util.ArrayList;
import java.util.List;

public class PesoDAO {
	
	//private Connection conexao;
	
	private List<RegPeso> fakeDB = new ArrayList<RegPeso>();
	
	public void cadastrar (RegPeso peso) {
		
		this.fakeDB.add(peso); // Simula INSERT na tabela de Registro de Pesos
	}
	
	public List<RegPeso> getAll(){
		
		// Simula um SELECT * na tabela de Registro de Pesos e preparo de lista para retorno
		
		List<RegPeso> lista = new ArrayList<RegPeso>(); // Nova Lista para armazenar os registros recuperados do "SELECT *"
		
		for (RegPeso peso : this.fakeDB) { // Simulando a leitura registro-a-registro do retorno do "SELECT *"
			lista.add(peso);
		}
		return lista; // Simula um SELECT * na tabela de Registro de Pesos
	}
	
}
