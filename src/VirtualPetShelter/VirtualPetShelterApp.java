package VirtualPetShelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	static String selection;
	// static String newPetName;
	// static String newPetDescription;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPetShelter pets = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Checker", " the fast running  Cheetah", 50, 50, 50, 50);
		VirtualPet pet2 = new VirtualPet("Pepper", " the talking Parrot", 30, 30, 30, 30);
		VirtualPet pet3 = new VirtualPet("GiGi", " the long necked Giraffe", 60, 60, 60, 60);
		VirtualPet pet4 = new VirtualPet("Falen", " the long-legged Flamingo", 40, 40, 40, 40);

		pets.admitPet(pet1);
		pets.admitPet(pet2);
		pets.admitPet(pet3);
		pets.admitPet(pet4);

		System.out.println("Thank you for working at J's Virtual Pet Shelter!\n");

		petStats(pets);

		listOptions();
		int choice = input.nextInt();

		do {

			if (choice == 1) {
				pets.feedAll();
				System.out.println("Oh, so you want to feed all the pets!\n" + "Thanks for feeding all the pets!\n");
				petStats(pets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 2) {
				pets.waterAll();
				System.out.println("Oh, so you want to water all the pets!\n" + "Thanks for watering all the pets!\n");
				petStats(pets);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 3) {
				pets.play();
				System.out.println("Oh great, so you want to play with one of the pets!\n");
				for (VirtualPet current : pets.allPets()) {
					System.out.println("" + current.getName() + "" + "" + current.getDescription() + "");
				}
				System.out.println("\nPlease enter the name of the pet you want to play with?");
				selection = input.next();
				System.out.println("Great, you can play with " + selection);

				petStats(pets);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 4) {
				System.out.println("Yay, you want to adopt a pet!");
				for (VirtualPet current : pets.allPets()) {
					System.out.println("" + current.getName() + "" + "\t" + current.getDescription());
				}
				System.out.println("Please enter the name of the pet you want to adopt?");
				selection = input.next();
				pets.adoptPet(selection);
				System.out.println("You will be a great fit for " + selection);
				petStats(pets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 5) {
				String newPetName;
				String newPetDescription;
				System.out.println("So you want to admit a pet, can you tell me their name?");
				newPetName = input.next();
				System.out.println("Can you please tell me what kind of pet you have?");
				newPetDescription = input.next();
				VirtualPet newPet = new VirtualPet(newPetName, newPetDescription);
				pets.admitPet(newPet);
				for (VirtualPet current : pets.allPets()) {
					System.out.println("" + current.getName() + "" + "\t" + current.getDescription());
				}
				System.out.println("Thanks for bringing your pet into the shelter, we will find your pet a safe home.");
				petStats(pets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 6) {
				System.out.println("It's always great working with you, see you next week!");
				input.next();

			} else {
				System.out.println("I'm sorry but you played with all the patients.");
				input.close();
				break;
			}
		} while (choice != 7);
		//input.close();
	}

	public static void petStats(VirtualPetShelter shelter) {
		System.out.println("This is the status of your pets: \n");
		System.out.println("Name    |Hunger |Thirst |Waste");
		System.out.println("--------|-------|-------|-------");
		for (VirtualPet current : shelter.allPets()) {
			System.out.println(current.getName() + "\t" + current.getHunger() + " \t" + current.getThirst() + " \t"
					+ current.getWaste());
		}
	}

	public static void listOptions() {
		System.out.println("\nWhat would you like to do next?\n");
		System.out.println("1 to feed the pets");
		System.out.println("2 to water the pets");
		System.out.println("3 to play with a pet");
		System.out.println("4 to adopt a pet");
		System.out.println("5 to admit a pet");
		System.out.println("6 to quit");

	}

}
