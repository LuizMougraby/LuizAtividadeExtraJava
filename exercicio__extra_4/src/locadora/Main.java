package locadora;

public class Main {
	 public static void main(String[] args) {
		 Carro carro = new Carro("Chevrolet Celta", 2000);
	     Moto moto = new Moto("Honda CG 160 Titan", 2024);
	     BicicletaEletrica bike = new BicicletaEletrica("Caloi E-Alta", 2024);
	     
	     carro.alugar();
	     carro.abastecer();

	     moto.alugar();
	     moto.abastecer();

	     bike.alugar();
	 }

}
