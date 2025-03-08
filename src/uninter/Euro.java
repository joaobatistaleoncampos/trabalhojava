package uninter;



   //Classe da moeda Euro

public class Euro extends Moeda {
	
	public Euro (double valorInicial) {
		this.valor = valorInicial;
	}

  //Mostra valor da moeda em Euro
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

   //Converter Euro para Real
	// Valor do euro em real atualmente R$ 6,25
	@Override
	public double converter() {
		return this.valor *5.36;		
	}	
	
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;
		
		if(this.valor != objetoDeEuro.valor) {
			return false;
		}
		
		return true;
	}
}