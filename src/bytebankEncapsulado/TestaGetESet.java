package bytebankEncapsulado;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente cinthia = new Cliente();

		cinthia.setNome("Cinthia Melquiades");

		conta.setTitular(cinthia);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programadora");

		// agora em duas linhas

		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadora");

		System.out.println(titularDaConta);
		System.out.println(cinthia);
		System.out.println(conta.getTitular());

	}
}
