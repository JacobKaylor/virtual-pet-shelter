import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private VirtualPetShelter underTest;

	private VirtualPet pet;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();

		pet = new VirtualPet("jim", "large");
	}

	@Test
	public void shouldAddPet() {
		underTest.add(pet);

		VirtualPet retrieved = underTest.findPet("jim");
		assertThat(retrieved, org.hamcrest.Matchers.is(pet));
	}

	@Test
	public void shouldAddMultiplePets() {
		VirtualPet anotherPet = new VirtualPet("jerry", "large");

		underTest.add(pet);
		underTest.add(anotherPet);

		Collection<VirtualPet> pets = underTest.pets();

		assertThat(pets, org.hamcrest.Matchers.containsInAnyOrder(pet, anotherPet));

		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}
	@Test
	public void shouldAllowAdoption() {
		VirtualPet anotherPet = new VirtualPet("jerry", "large");
		underTest.subtract(pet);
		underTest.add(anotherPet);
		
		Collection<VirtualPet> pets = underTest.pets();

		assertThat(pets, org.hamcrest.Matchers.contains(anotherPet));

		assertFalse(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(1, pets.size());

	}


}
