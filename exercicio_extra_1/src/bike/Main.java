package bike;

public class Main {
	public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta();
        
    System.out.println("Estado inicial:");
    minhaBicicleta.imprimirEstados();

    System.out.println("Acelerando...");
    minhaBicicleta.acelerar();
    minhaBicicleta.imprimirEstados();


}
