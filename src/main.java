
public class main {

	public static void main(String[] args) {
		
		Cliente bruna =new Cliente();
		 
		bruna.setNome("Bruna");
		
		Conta cc=new ContaCorrente(bruna);
		
		cc.depositar(1200);
		
		
		Conta poupanca=new Conta_Popança(bruna);
		
		cc.transferir(250,poupanca);
		
		cc.imprimirExtrato(0);
		poupanca.imprimirExtrato(0);

	}

}
