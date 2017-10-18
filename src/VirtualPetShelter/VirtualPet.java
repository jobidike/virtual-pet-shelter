package VirtualPetShelter;

public class VirtualPet { // model class
	// instance data
	private String name;
	private String description;
	private int hunger;
	private int waste;
	private int boredom;
	private int thirst;

	// constructor
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 12;
		this.waste = 10;
		this.boredom = 10;
		this.thirst = 12;
	}

	public VirtualPet(String name, String description, int hunger, int waste, int boredom, int thirst) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.waste = waste;
		this.boredom = boredom;
		this.thirst = thirst;
	}

	// Accessor method (getter)
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public void water() {
		hunger += 2;
		thirst -= 2;
		waste += 2;
	}

	public void feed() {
		hunger -= 3;
		thirst += 3;
		waste += 5;
	}

	public void play() {
		hunger += 5;
		thirst += 5;
		waste += 3;
	}

	public void tick(int userSelection) {
		hunger += userSelection;
		thirst += userSelection;
		waste += userSelection;
	}

}
