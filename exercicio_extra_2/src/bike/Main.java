package bike;

public class Main {
	public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta(10);
        
    System.out.println("Estado inicial:");
    minhaBicicleta.imprimirEstados();

    System.out.println("Acelerando...");
    minhaBicicleta.acelerar();
    minhaBicicleta.imprimirEstados();
    
    System.out.println("Acelerando novamente...");
    minhaBicicleta.acelerar();
    minhaBicicleta.imprimirEstados();
    
    System.out.println("Tentando acelerar além da velocidade máxima...");
    minhaBicicleta.acelerar();
    minhaBicicleta.imprimirEstados();

    System.out.println("Freando...");
    minhaBicicleta.frear();
    minhaBicicleta.imprimirEstados();
    
    System.out.println("Freando novamente...");
    minhaBicicleta.frear();
    minhaBicicleta.imprimirEstados();
    }
}