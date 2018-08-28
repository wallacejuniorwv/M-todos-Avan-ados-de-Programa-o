package FactoryMethod;




	import java.io.IOException;
	import java.util.Collections;
	import java.util.List;
	import java.util.LinkedList;

		public class factoryMethod {
			
		
	  
		class FabricaFiat implements FabricaDeCarro {
	 
	    @Override
	    public CarroSedan criarCarroSedan() {
	        return new Siena();
	    }
	 
	    @Override
	    public CarroPopular criarCarroPopular() {
	        return new Palio();
	    }
	  }
	  class FabricaFord implements FabricaDeCarro{

		public CarroSedan criarCarroSedan() {
			return new FordKaSedan();
		}

		
		public CarroPopular criarCarroPopular() {
			return new FordaKa();
		}
		  
	  }
	  
	  interface CarroPopular {
	    void exibirInfoPopular();
	  }
	  interface CarroSedan {
	    void exibirInfoSedan();
	  }
	  class FordKaSedan implements CarroSedan{

		public void exibirInfoSedan() {
			System.out.println("Modelo: Forda Ka Sedan\n Fábrica: Ford\nCategoria:Sedan");
			
		}
		  
	  }
	  class FordaKa implements CarroPopular{

		
		public void exibirInfoPopular() {
			System.out.println("Modelo: Hyunday HB20"
					+ "\n Fábrica: Hyundai"
					+ "\nCategoria: Popular");
			
		}
		  
	  }
	  
	  class Palio implements CarroPopular {
	 
	 
	    public void exibirInfoPopular() {
	        System.out.println("Modelo: Palio"
	        		+ "\nFábrica: Fiat"
	        		+ "\nCategoria:Popular");
	    }
	  }
	  class Siena implements CarroSedan {
	 
	    public void exibirInfoSedan() {
	        System.out.println("Modelo: Siena"
	        		+ "\nFábrica: Fiat"
	        		+ "\nCategoria:Sedan");
	    }
	  }
	  public static void main(String[] args) {
		  factoryMethod g = new factoryMethod();
		  FabricaFiat fabrica = g.new FabricaFiat();
	    CarroSedan sedan = fabrica.criarCarroSedan();
	    CarroPopular popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	    
	    FabricaFord fabrica2 = g.new FabricaFord();
	    sedan = fabrica2.criarCarroSedan();
	    popular = fabrica2.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	  }
}

