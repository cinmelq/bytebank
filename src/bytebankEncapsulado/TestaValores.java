package bytebankEncapsulado;

public class TestaValores {

	public static void main(String[] args) {
//		Conta conta = new Conta(0002, 4789);
//		
//		// conta está incosistente
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
//		
//		System.out.println(conta.getAgencia());
		Conta conta = new Conta();
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular());

		System.out.println("Preenchendo conta");
		conta.setAgencia(0002);
		conta.setNumero(5689);
		conta.deposita(500);

		Cliente cinthia = new Cliente();
		cinthia.setCpf("555.555.555-45");
		cinthia.setNome("Cinthia");
		cinthia.setProfissao("Estagiária");

		conta.setTitular(cinthia);

		Conta conta2 = new Conta(500, 0002, 5689, cinthia);

		System.out.println(conta2);
	}
}
