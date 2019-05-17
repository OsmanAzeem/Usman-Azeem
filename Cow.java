package labC;

import java.util.Random;

public class Cow extends Mammal {
	public void Speak() {
		System.out.println("Moo");
	}

	public int Milk() {
		Random r = new Random();
		int low = 2;
		int high = 5;
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
