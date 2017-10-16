package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter { // Maintenance Class

	// map needs 2 type params (1 for key and 1 for the value)
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	public int hunger;
	public int waste;
	public int boredom;
	public int thirst;

//	VirtualPet pet1 = new VirtualPet("Timothy", "Tiger", 50, 50, 50, 50);
//	VirtualPet pet2 = new VirtualPet("Pepper", "Parrot", 30, 30, 30, 30);
//	VirtualPet pet3 = new VirtualPet("GiGi", "Giraffe", 60, 60, 60, 60);
//	VirtualPet pet4 = new VirtualPet("Falen", "Flamingo", 40, 40, 40, 40);

	public Collection<VirtualPet> petValues() {
		return pets.values();
	}

	public VirtualPet getName(String name) {
		return pets.get(name);
	}

	public int getSize() {
		return pets.size();
	}

	public void admitPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public void adoptPet(String name) {
		pets.remove(name);
	}

	public void tick(int hunger, int thirst) {
		hunger -= 5;
		thirst -= 5;
	}

	public void waterAll(int thirst) {
		for (VirtualPet waterAll : pets.values()) {
			waterAll.getThirst();
		}
	}

	public void play(String name) {
		pets.get(name);
	}

	public void bathroom(String name) {
		pets.get(name);
	}

	public void tickAll() {
		hunger += 3;
		waste += 10;
		boredom += 5;
		thirst -= 4;
	}

}
