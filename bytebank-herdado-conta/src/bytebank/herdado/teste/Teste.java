package bytebank.herdado.teste;

import bytebank.herdado.modelos.Cliente;
import bytebank.herdado.modelos.ContaCorrente;
import bytebank.herdado.modelos.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(9);
		
		ContaCorrente cc = new ContaCorrente(22, 3333);
		ContaPoupanca cp = new ContaPoupanca(22, 44444);
		
		Cliente cliente = new Cliente();
		
		System.out.println(cc);
		
		println(cc);
		println(cliente);
		
		
		
		
		
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(Object referencia) {
		
	}

}
