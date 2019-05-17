package labC;

import java.util.Scanner;

public class Fox extends Mammal {
	String Speak;
	Scanner input = new Scanner(System.in);

	public void Speak() {
		System.out.print("What does the fox say? ");
		Speak = input.nextLine();
		System.out.println(Speak + "!");
	}

}
