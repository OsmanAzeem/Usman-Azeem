package labC;

public class MainLabC {
	public static void main(String[] args) {
		// Main Method... DO NOT CHANGE THIS METHOD
		Cat kitty = new Cat();
		Dog puppy = new Dog();
		Chihuahua buffy = new Chihuahua();
		Cow bessie = new Cow();
		Sheep aSheep = new Sheep();
		Fox littleFox = new Fox();
		kitty.Speak();
		puppy.Speak();
		buffy.Speak();
		bessie.Speak();
		aSheep.Speak();
		littleFox.Speak();
		System.out.println("The cow produces " + bessie.Milk() + " Gallons today.");
		trySwimming(puppy);
		trySwimming(buffy);
		trySwimming(kitty);
		trySwimming(bessie);
		trySwimming(aSheep);
		trySwimming(littleFox);
	}

	private static void trySwimming(Mammal currentMammal) {
		if (currentMammal instanceof Dog || currentMammal instanceof Chihuahua) {
			System.out.print("Splash, paddle paddle ");
			currentMammal.Speak();
		}

		else if (currentMammal instanceof Fox) {
			System.out.print("Splash, paddle paddle ");
			currentMammal.Speak();
		} else if (currentMammal instanceof Cat) {
			System.out.println("hiss");
		} else if (currentMammal instanceof Cow || currentMammal instanceof Sheep) {
			currentMammal.Speak();
		}

	}
}