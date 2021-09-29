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
		return this.fakeDB; // Simula um SELECT * na tabela de Registro de Pesos
	}
	
}
