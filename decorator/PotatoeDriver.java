import java.util.Locale;
import java.util.Scanner;

public class PotatoeDriver {
    private String[] options = { "Eyes", "Nose", "Mouth", "Ears", "Hat", "Quit" };
	private static final String ERROR_USER_CHOICE = "Please enter a valid number between 1 and ";
	private Scanner scanner;

	/*
	 * Original ascii drawing was found here:
	 * https://www.asciiart.eu/movies/toy-story
	 */
	public PotatoeDriver() {
		scanner = new Scanner(System.in);
	}

	public void play() {
		Character potatoeHead = new PotatoeHead("Earl");

		while (true) {
			clear();
			System.out.println("Here's our Potatoe Head: ");
			System.out.println(potatoeHead);

			displayMenu();
			int userOption = getUserChoice();

			if (userOption == 0) {
				potatoeHead = new Eyes(potatoeHead);
			} else if (userOption == 1) {
				potatoeHead = new Nose(potatoeHead);
			} else if (userOption == 2) {
				potatoeHead = new Mouth(potatoeHead);
			} else if (userOption == 3) {
                potatoeHead = new Ears(potatoeHead);
            } else if (userOption == 4) {
                potatoeHead = new Hat(potatoeHead);
            } else if (userOption == 5) {
                break;
			} 
		}

		System.out.println("Goodbye");
	}

	private void displayMenu() {
		System.out.println("What would you like to give our potatoe head? ");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
	}

	private int getUserChoice() {
		while (true) {
			System.out.print("Enter Number: ");
			try {
				int index = Integer.parseInt(scanner.nextLine());

				if (index < 1 || index > options.length) {
					System.out.println(ERROR_USER_CHOICE + options.length);
					continue;
				}
				return index - 1;

			} catch (Exception e) {
				System.out.println(ERROR_USER_CHOICE + options.length);
			}
		}
	}

	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		PotatoeDriver driver = new PotatoeDriver();
		driver.play();
	}
}