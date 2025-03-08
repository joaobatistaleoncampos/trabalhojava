package uninter;


   //Classe da moeda Dolar

public class Dolar extends Moeda {
	
	public Dolar (double valorInicial) {
		this.valor = valorInicial;
	}
	

	//Mostra valor da moeda em Dólar
	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
	}

  //Converção Dólar para Real
  // Valor do Dólar atualmente  em real: R$ 5,79
	@Override
	public double converter() {
		return this.valor *5.79;		
	}	
	
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}