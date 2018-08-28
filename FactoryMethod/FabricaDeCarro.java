package FactoryMethod;

import FactoryMethod.factoryMethod.CarroPopular;
import FactoryMethod.factoryMethod.CarroSedan;

public interface FabricaDeCarro {
	
	
		
	    CarroSedan criarCarroSedan();
	    CarroPopular criarCarroPopular();
	  }


