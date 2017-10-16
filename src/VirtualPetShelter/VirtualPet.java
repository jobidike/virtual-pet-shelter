package VirtualPetShelter;

public class VirtualPet { //model class
	//instance data
		private String name; //unique key
		private String description;
		private int hunger;
		private int waste;
		private int boredom;
		private int thirst;
		
		//constructor
		public VirtualPet (String name, String description) {
			this.name = name;
			this.description = description;
		}
		public VirtualPet (String name, String description, int hunger, int waste, int boredom, int thirst) {
			this.name = name;
			this.description = description;
			this.hunger = hunger;
			this.waste = waste;
			this.boredom= boredom;
			this.thirst = thirst;
		}
		 
		
		//Accessor method (getter)
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
		
		@Override
		public String toString()
		{
			return "Name: " + name + "\tDescription: " + description + "\tHunger: " + hunger + "\tWaste: " +
					waste + "\tBoredom: " + boredom + "\tThirst: " + thirst;
		}
		
			
		
		
		
		
		}
		
			
	


