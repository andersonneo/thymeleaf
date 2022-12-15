package gene;

public class CafeLatte {

	private String name="CafeLatte";
	private Milk milk;
	private Espresso espresso;
	
	public CafeLatte() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Espresso getEspresso() {
		return espresso;
	}

	public void setEspresso(Espresso espresso) {
		this.espresso = espresso;
	}
	
	
	public void dispaly() {
		System.out.println(this.name + this.espresso+this.milk);
	}
	
	
	public String toString() {
		return "CafeLatte";
	}
	
}
