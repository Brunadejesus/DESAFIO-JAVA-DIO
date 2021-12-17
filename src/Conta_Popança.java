
public class Conta_Popança extends Conta {
	
	
	
	public Conta_Popança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato(double valor) {
			System.out.println("\n +++++Estrato Conta Poupança+++++\n ");
					super.imprimirAtributosemComuns();
	
	}

}
