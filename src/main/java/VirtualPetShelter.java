
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public void add(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public VirtualPet findPet(String petName) {

		return pets.get(petName);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void subtract(VirtualPet pet) {
		pets.remove(pet.getName(), pet);

	}

	public void feedAllPets(VirtualPet pet) {
		
		
	}

}
