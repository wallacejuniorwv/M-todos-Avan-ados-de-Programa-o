package Exercicio8;


public enum Cargo implements Strategy {
	
	DESENVOLVEDOR {
		public double calcularGratificacao(double valorSalario, int nivel) {
			   if (nivel >= 2) {
                return valorSalario * 1.25;
            }
            return valorSalario * 1.15;
		}
	},
	GERENTE {
		public double calcularGratificacao(double valorSalario, int nivel) {
			   if (nivel >= 2) {
                   return valorSalario * 1.30;
               }
               return valorSalario * 1.45;
		}
	},
	LIDER {
		public double calcularGratificacao(double valorSalario, int nivel) {
			   if (nivel >= 2) {
                return valorSalario * 1.35;
            }
            return valorSalario * 1.25;
		}
	},
	DBA {
		public double calcularGratificacao(double valorSalario, int nivel) {
			   if (nivel >= 2) {
                return valorSalario * 1.25;
            }
            return valorSalario * 1.15;
		}
	};
}