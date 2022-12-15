package gene;

public final class Client {

	public static void main(String[] args) {

		Barista barista = new Barista();
		
		barista.setEspressoMahine(new EspressoMahine());
		Espresso espresso = barista.makeEspresso();
		espresso.display();
	}

}
