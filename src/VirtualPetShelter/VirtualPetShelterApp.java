package VirtualPetShelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	static int choice;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Map<String, String> pets = new HashMap<String, String>();

		Shelter myShelter = new Shelter();

		VirtualPet pet1 = new VirtualPet("Timothy", "Tiger", 50, 50, 50, 50);
		VirtualPet pet2 = new VirtualPet("Pepper", "Parrot", 30, 30, 30, 30);
		VirtualPet pet3 = new VirtualPet("GiGi", "Giraffe", 60, 60, 60, 60);
		VirtualPet pet4 = new VirtualPet("Falen", "Flamingo", 40, 40, 40, 40);

		myShelter.admitPet(pet1);
		myShelter.admitPet(pet2);
		myShelter.admitPet(pet3);
		myShelter.admitPet(pet4);

		System.out.println("Thank you for working at J's Virtual Pet Shelter!\n");
		System.out.println("This is the status of your pets: \n");

		for (VirtualPet current : myShelter.petValues()) {
			// System.out.println(current.getDescription() + " " + current.getName());
			System.out.println(current.toString());

		}

		listOptions();

		while (choice != -1) {

			if (choice == 1) {

				System.out.println("You want to feed all the pets!");
				System.out.println("Here are the currents stats:\n ");

				for (VirtualPet current : myShelter.petValues()) {
					System.out.println(current.toString());

				}
				input.nextInt();
			}
			listOptions();

		}
		if (choice == 2) {
			System.out.println("You watered all the pets!");
			System.out.println("Here are the current stats:\n ");

			for (VirtualPet current : myShelter.petValues()) {
				System.out.println(current.toString());

			}

			input.nextLine();
		}

		listOptions();

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

