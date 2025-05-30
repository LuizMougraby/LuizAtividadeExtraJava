package bike;

public class Bicicleta {
	
	 private int velocidade;
	 private int marcha;
	 private int velocidadeMaxima; 
	 
	 public Bicicleta(int velocidadeMaxima) {
	        this.velocidade = 0;
	        this.marcha = 0;
	        this.velocidadeMaxima = velocidadeMaxima;
	    }
	 public void acelerar() {
	        velocidade += 5;
	        marcha++;
	    }
	 
	 public void frear() {
	        if (velocidade >= 5) {
	            velocidade -= 5;
	        } else {
	            velocidade = 0;
	        }

	        if (marcha > 0) {
	            marcha--;
	        }
	    }
	 
	 public void imprimirEstados() {
	        System.out.println("Velocidade: " + velocidade + " km/h");
	        System.out.println("Marcha: " + marcha);
	        System.out.println("-----------------------");
	    }


}
