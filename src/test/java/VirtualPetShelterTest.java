import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter underTest;
	
	private VirtualPet pet;
	
	
	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
		
		pet = new VirtualPet("jim","large");
	}
	@Test
	public void shouldAddPet() {
		underTest.add(pet);
		
		VirtualPet retrieved = underTest.findPet("jim");
		assertThat(retrieved, org.hamcrest.Matchers.is(pet));
	}
	@Test
	public void shouldAddMultiplePets() {
		VirtualPet anotherPet = new VirtualPet("jerry","large");
		
		underTest.add(pet);
		underTest.add(anotherPet);
		
		Collection<VirtualPet> pets = underTest.pets();
		
		
		
	}

}
