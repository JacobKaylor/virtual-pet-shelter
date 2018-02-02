import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	private Map<String, VirtualPet> pets = new HashMap<>();

	public void add(VirtualPet pet) {
		pets.put(pet.getName(), pet);
		
	}

	public VirtualPet findPet(String petName) {
		
		return null;
	}


	

}
