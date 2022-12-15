package gene;

public class Barista {
	
	private EspressoMahine espressoMahine;
	
	public Barista() {
		
	}  

	public void setEspressoMahine(EspressoMahine espressoMahine) {
		this.espressoMahine = espressoMahine;
	}
	
	public void makeCafeLatte() {
		Espresso espresso = this.espressoMahine.makeEspresso();
	}
	

}
