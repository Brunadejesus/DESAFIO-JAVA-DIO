
public class ContaCorrente extends Conta {
	
	
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato(double valor) {
		// TODO Auto-generated method stub
		
			
			System.out.println("\n +++++Estrato Conta Corrente+++++\n ");
			super.imprimirAtributosemComuns();
		
		}

	
		
	}
	
	
	
	
	


