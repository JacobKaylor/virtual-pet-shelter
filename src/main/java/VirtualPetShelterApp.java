import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter pets = new VirtualPetShelter();
		
		System.out.println("Welcome to the Pet Shelter!");
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to feed all pets");
		System.out.println("Press 2 to water all pets");
		System.out.println("Press 3 to give a pet up for adoption");
		System.out.println("Press 4 to accept a new pet");
		System.out.println("Press 5 to play with a specific pet");
		String response = input.nextLine();
		
		if(response.equals("1")) {
			pets.feedAllPets();
		}else if(response.equals("2")) {
			pets.waterAllPets();
		}else if(response.equals("3")) {
			System.out.println("Please enter the name of the pet being adopted");
			
			pets.subtract();
		}
		
		

	}

}
