
public class VirtualPet {

	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 50;
	private int waste = 50;
	private String name = "";
	private String description;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void tick() {
		hunger += 3;
		thirst += 3;
		boredom += 3;
		waste += 3;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getWaste() {
		return waste;
	}

	public void feed(int food) {
		hunger -= food;
		thirst += 5;
		waste += 10;
	}

	public void water(int drink) {
		thirst -= drink;
	}

	public void play(int run) {
		boredom -= run;
		thirst += 3;
		hunger++;
	}

	public void waste(int poop) {
		waste -= poop;
	}
	@Override
	public String toString() {
		return name+description;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}