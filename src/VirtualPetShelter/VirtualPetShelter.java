package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter { // Maintenance Class

	// map needs 2 type params (1 for key and 1 for the value)
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> allPets() {
		return pets.values();
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public int getSize() {
		return pets.size();
	}

	public void admitPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet adoptPet(String name) {
		return pets.remove(name);
	}

	public void feedAll() {
		for (VirtualPet pet : allPets()) {
			pet.feed();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : allPets()) {
			pet.water();
		}
	}

	public void play() {
		for (VirtualPet pet : allPets()) {
			pet.play();
		}
	}

	public void tickAll(int userSelection) {
		for (VirtualPet pet : allPets()) {
			pet.tick(userSelection);
		}
	}

}
