package VirtualPetShelter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter { //Maintenance Class
	
//	VirtualPet pet1 = new VirtualPet("Timothy", "Tiger",50, 50, 50, 50);
//	VirtualPet pet2 = new VirtualPet("Pepper", "Parrot", 30, 30, 30, 30); 
//	VirtualPet pet3 = new VirtualPet("GiGi","Giraffe", 60, 60, 60, 60);
//	VirtualPet pet4 = new VirtualPet("Falen", "Flamingo",40, 40, 40, 40);

		// map needs 2 type params (1 for key and 1 for the value)
		private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
		public int hunger;
		public int waste;
		public int boredom;
		public int thirst;

		public Collection <VirtualPet> petValues() {
			return pets.values();
		}
		public VirtualPet getName(String name) {
			return pets.get(name);
		}
		
		public int getSize() {
			return pets.size();
		}
		
		public void admitPet(VirtualPet pet) {
			pets.put(pet.getName(),pet);
		}
		public void adoptPet(String name) {
			pets.remove(name);
		}
		
		public void feed(int hunger) {
			hunger-=5;
		}
		public void water(int thirst) {
			thirst-=5;
		}
		public void play(String name) {
			pets.get(name);
		}
		public void bathroom(String name) {
			pets.get(name);
		}
		
		public void tick() {	
			hunger+=3;
			waste+=10;
			boredom+=5;
			thirst-=4;
		}
		
		
		
	
		
	}
//test adding a pet
//test removing a pet
//test watering the pet



