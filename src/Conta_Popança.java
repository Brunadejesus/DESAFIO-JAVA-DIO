
public class Conta_Popan�a extends Conta {
	
	
	
	public Conta_Popan�a(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato(double valor) {
			System.out.println("\n +++++Estrato Conta Poupan�a+++++\n ");
					super.imprimirAtributosemComuns();
	
	}

}
