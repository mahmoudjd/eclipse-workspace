package hamurabi.menus;

import hamurabi.city.City;
import java.util.*;

public class TextInterface {

	private Scanner scanner;
	private City city;

	public TextInterface(Scanner scanner) {
		this.scanner = scanner;
		this.city = new City("Codepolis");
	}

	public void printStatusMenu() {
		System.out.println("\n===== STATUS MENU =====");
		System.out.println("Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
				+ " bushels of grain, " + city.getPopulation() + " residents.");

		printGameMenu();

	}

	public void printPlantMenu() {

		System.out.println("\n===== PLANT MENU =====");
		System.out.println("City Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
				+ "bushels of grain, " + city.getPopulation() + " residents.");

		System.out.println("How many acres of land do you wish to plant with seed?");
		int acresToPlant = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		if (acresToPlant <= 0) {
			System.out.println("Invalid input. Please enter a positive number of acres to plant.");
			printPlantMenu();
			return;
		}

		if (city.plantCrops(acresToPlant)) {
			System.out.println("New Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
					+ " bushels of grain, " + city.getPopulation() + " residents.");
			printGameMenu();
		} else {
			System.out.println("Invalid input. Not enough resources to plant crops.");
			printPlantMenu();
		}

	}

	public void printFeedMenu() {
		System.out.println("\n===== FEED MENU =====");
		System.out.println("City Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
				+ " bushels of grain, " + city.getPopulation() + " residents.");
		System.out.println("How many bushels do you would like to feed to your residents?");
		int amount = scanner.nextInt();
		scanner.nextLine();

		if (amount <= 0) {
			System.out.println("Invalid input. Please enter a positive number of bushels.");
			printFeedMenu();
			return;
		}
		if (city.feedPopulation(amount)) {
			System.out.println("New Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
					+ " bushels of grain, " + city.getPopulation() + " residents.");

			printGameMenu();
		} else {
			System.out.println("Invalid Input");
			printFeedMenu();
		}

	}

	public void printSellMenu() {
		System.out.println("\n===== SELL MENU =====");
		System.out.println("Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
				+ " bushels of grain, " + city.getPopulation() + " residents.");
		System.out.println("Current price per acres: ");
		int pricePerAcre = scanner.nextInt();
		scanner.nextLine();
		System.out.println("How many acres would you like to sell?");
		int acresToSell = scanner.nextInt();
		scanner.nextLine();
		
		if (acresToSell <= 0 || pricePerAcre <= 0) {
			System.out.println("Invalid input. Please enter a positive number of bushels.");
			printSellMenu();
			return;
		}
		if (city.sellLand(pricePerAcre, acresToSell)) {

			System.out.println("New Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
					+ " bushels of grain, " + city.getPopulation() + " residents.");

			printGameMenu();
		} else {
			System.out.println("Invalid Input");
			printSellMenu();
		}

	}

	public void printBuyMenu() {
		System.out.println("\n===== BUY MENU =====");

		System.out.println("Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
				+ "bushels of grain, " + +city.getPopulation() + " residents.");
		System.out.println("Current price per acres: ");
		int pricePerAcre = scanner.nextInt();
		scanner.nextLine();

		System.out.println("How many acres would you like to buy?");
		int acresToBuy = scanner.nextInt();
		scanner.nextLine();

		if (acresToBuy <= 0 || pricePerAcre <= 0) {
			System.out.println("Invalid input. Please enter a positive number of bushels.");
			printSellMenu();
			return;
		}
		if (city.buyLand(pricePerAcre, acresToBuy)) {

			System.out.println(" New Status: " + city.getAcresOfLand() + " acres of land, " + city.getBushelsOfGrain()
					+ "bushels of grain, " + +city.getPopulation() + " residents.");

			printGameMenu();
		} else {
			System.out.println("Invalid Input");
			printBuyMenu();
		}
	}

	public void printGameMenu() {
		System.out.println("\n===== GAME MENU =====");
		String[] options = { "1. BUY", "2. SELL", "3. FEED", "4. PLANT", "5. SHOW STATUS",
				"6. QUIT GAME" };

		for (String option : options) {
			System.out.println(option);
		}

		System.out.println("Please select an action:");
		while (true) {
			int number = scanner.nextInt();
			scanner.nextLine();

			switch (number) {
			case 1:
				printBuyMenu();
				break;
			case 2:
				printSellMenu();
				break;
			case 3:
				printFeedMenu();
				break;
			case 4:
				printPlantMenu();
				break;
			case 5:
				printStatusMenu();
				break;
			case 6:
				printMainMenu();
				break;
			default:
				System.out.println("Invalid input. Please try again.");
			}
		}
		
	}

	public void printMainMenu() {

		String[] options = { "\n===== Main MENU =====", "1. NEW GAME", "2. QUIT",
				"Please select an option:" };

		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i]);
		}

	}

	public void run() {
		printMainMenu();
		int number = scanner.nextInt();
		scanner.nextLine();
		if (number == 1) {
			printGameMenu();
		} else if (number == 2) {
			System.out.println("Good Bye!");
		} else {
			System.out.println("Invalid Input. try again");
			run();
		}
	}

}
