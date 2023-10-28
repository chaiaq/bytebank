
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(50, 6541);
		/*
		*conta.setAgencia(-50);
		*conta.setNumero(-330);
		*/
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		
		Conta conta2 = new Conta (50, 654781);
		Conta conta3 = new Conta (14, 654987);
		
		System.out.println("contas criadas até agora: " + Conta.getTotal());
	}
}
