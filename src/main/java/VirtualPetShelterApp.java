import java.util.Scanner;
import java.util.Set;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter pets = new VirtualPetShelter();
		// VirtualPet pet = new VirtualPet("jim", "big", 50, 50, 50, 50);

		// System.out.println(pets.pets());
		// System.out.println(pets.name());
		// System.out.println(pets);
		//while(){
		System.out.println("Welcome to the Pet Shelter!");
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to feed all pets");
		System.out.println("Press 2 to water all pets");
		System.out.println("Press 3 to give a pet up for adoption");
		System.out.println("Press 4 to accept a new pet");
		System.out.println("Press 5 to play with a specific pet");
		String response = input.nextLine();

		if (response.equals("1")) {
			pets.feedAllPets();
		} else if (response.equals("2")) {
			pets.waterAllPets();
		} else if (response.equals("3")) {
			System.out.println("Please enter the name of the pet being adopted");
			String name = input.next();
			System.out.println("Please enter a description of the pet");
			String description = input.next();
			VirtualPet pet = new VirtualPet(name, description, 50, 50, 50, 50);
			pets.subtract(pet);

		} else if (response.equals("4")) {
			System.out.println("Please enter the name of the new pet");
			String name = input.next();
			System.out.println("Please enter a description of the pet");
			String description = input.next();
			VirtualPet pet = new VirtualPet(name, description, 50, 50, 50, 50);
			pets.add(pet);
		} else if (response.equals("5")) {
			System.out.println("Please enter the name of the pet you want to play with");
			String name = input.next();

			VirtualPet pet = pets.findPet(name);
			
			
			pets.playWithPet(pet);

		}
		pets.tick();
		System.out.println(pets.name());
		System.out.println(pets.pets());

	}
}

