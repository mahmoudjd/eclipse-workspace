package Erben;

public class WoodFurniture {
	private byte pecies ; 
	private float weight;
	private float preis;

	public WoodFurniture(byte pecies, float weight, float preis) {
		this.pecies = pecies;
		this.preis = preis;
		this.weight = weight;
	}

	public byte getPecies() {
		return pecies;
	}

	public float getWeight() {
		return weight;
	}

	public float getPreis() {
		return preis;
	}

	public String toString () {
		return "Furniture of wood "+pecies +"with weight "+ weight+"for only "+ preis;
	}
	
	
}
