package br.com.rd.rdevs.exercicioleo;

public class Inverter {

	String frase;
	public Inverter() {

	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String inverterMesmaLinha(String frase) {
		String resultado = "";
		for (int i = (frase.length() - 1); i >= 0; i--) {
			resultado += frase.charAt(i);
		}
		return resultado;
	}

	public String inverterProxLinha(String frase) {
		String resultado = "";
		for (int i = (frase.length() - 1); i >= 0; i--) {
			resultado += (frase.charAt(i) + "\n");
		}
		return resultado;
	}		

	public String pularrLinha(String frase) {
		String resultado = "";
		for (int i = 0; i <= (frase.length() - 1); i++) {
			resultado += (frase.charAt(i) + "\n");
		}
		return resultado;
	}

}
