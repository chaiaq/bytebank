package bytebank.herdado.teste;
import bytebank.herdado.modelos.Conta;
import bytebank.herdado.modelos.ContaCorrente;
import bytebank.herdado.modelos.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
