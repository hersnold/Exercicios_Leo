package br.com.rd.rdevs.exercicioleo;

public class primeiro {
	public void localizaValor(String frase, String localizar) {
		if (frase.toLowerCase().contains(localizar.toLowerCase()) == true) {
			System.out.println("A " + localizar + " tem na frase.");
		} else {
			System.out.println("Não existe na frase.");
		}
	}
	public void mudarEspacoBranco(String frase, String valorMudar) {
		System.out.println("Resultado: " + frase.replace("", valorMudar));
	}
	public void procurarVoid(String frase) {
		if (frase.isEmpty()) {
			System.out.println("Vazio!");
		} else {
			System.out.println("Existe!");
		}
	}
	public void contarCarac(String frase) {
		System.out.println("Tamanho: " + frase.length());
	}
}
