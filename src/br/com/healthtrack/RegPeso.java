package br.com.healthtrack;

import java.util.Date;

// Entidade a ser perstida no Banco de Dados

public class RegPeso {
	private int id;
	private Date data;
	private Double peso;
	
	public RegPeso (int id, Date data, Double peso) {
		this.id = id;
		this.data = data;
		this.peso = peso;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public int getId () {
		return this.id;
	}
	
	public void setData (Date data) {
		this.data = data;
	}
	
	public Date getData () {
		return this.data;
	}
	
	public void setPeso (Double peso) {
		this.peso = peso;
	}
	
	public Double getPeso () {
		return this.peso;
	}

	@Override
	public String toString() {
		return "RegPeso [id=" + id + ", data=" + data + ", peso=" + peso + "]";
	}
	
	
}
