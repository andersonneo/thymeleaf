package gene;

public class EspressoMahine {
	
	private int price=3000;
	
	public EspressoMahine() {
		
	}

	public Espresso makeEspresso() {
		return new Espresso();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "EspressoMahine";
	}
	
}
