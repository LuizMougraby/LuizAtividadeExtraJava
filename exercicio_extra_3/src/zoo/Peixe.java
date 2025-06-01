package zoo;

public class Peixe extends Animal implements Aquatico{
	@Override
    public void emitirSom() {
      System.out.println("O peixe faz bolhas.");
    }
	
	@Override
	public void alimentar() {
	  System.out.println("O peixe está comendo algas.");
	}

}
