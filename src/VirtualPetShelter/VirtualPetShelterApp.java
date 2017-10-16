package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	
	static int choice;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		VirtualPetShelter myShelter = new VirtualPetShelter();
		
		VirtualPet pet1 = new VirtualPet("Timothy", "Tiger",50, 50, 50, 50);
		VirtualPet pet2 = new VirtualPet("Pepper", "Parrot", 30, 30, 30, 30); 
		VirtualPet pet3 = new VirtualPet("GiGi","Giraffe", 60, 60, 60, 60);
		VirtualPet pet4 = new VirtualPet("Falen", "Flamingo",40, 40, 40, 40);
		
		myShelter.admitPet(pet1);
		myShelter.admitPet(pet2);
		myShelter.admitPet(pet3);
		myShelter.admitPet(pet4);

		System.out.println("Thank you for working at J's Virtual Pet Shelter!\n");
		System.out.println("This is the status of your pets: \n");
		
		for (VirtualPet current : myShelter.petValues()) {
			System.out.println(current.toString());
			
	}
		listOptions();
		
		while (choice!=-1) {
			if (choice==1) {
				System.out.println("You want to feed all the pets!");
				System.out.println("Here are the currents stats:\n ");
				
//				for (VirtualPet current : myShelter.petValues()) {
//					System.out.println(current.toString());
//					
//					}
			input.nextLine();
			}
			listOptions();
		
			}else if (choice==2) {
				System.out.println("You watered all the pets!");
				System.out.println("Here are the current stats:\n ");
				
				for (VirtualPet current : myShelter.petValues()) {
					System.out.println(current.toString());
				
				}
	
				input.nextLine();
		}
	
			listOptions();
	
			
			//}	else if (choice.equals("3")) {	
		
		
		
		
		
		
		
		
		
		
	}
			
			public static void listOptions() {
			System.out.println("\nWhat would you like to do next?\n");
			System.out.println("1 to feed the pets");
			System.out.println("2 to water the pets");
			System.out.println("3 to play with a pet");
			System.out.println("4 to adopt a pet");
			System.out.println("5 to admit a pet");
			System.out.println("6 to quit");
			choice = input.nextInt();

	}

}

//System.out.println("Name\t" + "Description\t" + "Hunger\t " + "Waste " +  "Boredom " + "Thirst");
//System.out.println("Timothy\t" + "Tiger\t" + "\t50\t" + " 50\t" + "50\t" + " 50");
//System.out.println("Pepper\t" + "Parrot\t" + "\t30\t" + " 30\t" + "30\t" + " 30");
//System.out.println("GiGi\t" + "Giraffe\t" + "\t60\t" + " 60\t" + "60\t" + " 60");
//System.out.println("Falen\t" + "Flamingo\t" + "40\t" + " 40\t" + "40\t" + " 40");
