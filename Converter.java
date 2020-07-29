package br.com.rd.rdevs.exercicioleo;

import java.util.ArrayList;

public class Converter {

	public Converter() {

	}
	private String valor
	public String getValor() {
		return valor
	}
	public void setPalavra(String valor) {
		this.valor= valor;
	}
	public int alterar(String valor) {
		int num = Integer.parseInt(valor);
		return num;
	}

	public int alterarSemBiblioteca(String valor) {
		int r = 0;
	while (valor.length() > 0) {
			char a = valor.charAt(0);
			r = r * 10 + (a - '0');
		valor = valor.substring(1);
		}
		return r;
	}
	

}
