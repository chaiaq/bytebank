package bytebank.herdado.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura   ";
		// String outro = new String("Alura");
		// a classe string permite criação sem o comando novo
		
		/*
		nome.replace("A", "a");
		nome.toLowerCase(nome);
		*/
		// strings não podem ser alteradas depois de criadas
		// apenas substituidas por outra string
		
		System.out.println(nome);
		
		String outra = nome.replace("A", "a");
		System.out.println(outra);
		
		System.out.println(nome.charAt(2));
		// imprime o caractere na posição 2 (igual ao array começa no 0)
		System.out.println(nome.indexOf("ra"));
		// devolve a posição onde a expressão se inicia dentro da string
		System.out.println(nome.substring(1));
		// devolve a string a partir da posição indicada
		System.out.println(nome.length());
		// devolve o numero de caracteres
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		// imprime todos os caracteres um a um
		
		System.out.println(nome.isEmpty());
		// devolve se a string está vazia ou não
		System.out.println(nome.trim());
		// tira todos os espaços da palavra
		System.out.println(nome.contains("Alu"));
		// verifica se há uma sequencia ou outra string dentro desta
		
	}

}
