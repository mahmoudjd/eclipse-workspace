package hamurabi.city;
public class CityTestDrive {
    public static void main(String[] args) {
        // Create City instance
        City codeopolis = new City("Codeopolis");

        // Test buyLand
        System.out.println("Buying land...");
        if (codeopolis.buyLand(5, 10)) {
            System.out.println("Land purchase successful.");
        } else {
            System.out.println("Insufficient funds for land purchase.");
        }

        // Test sellLand
        System.out.println("\nSelling land...");
        if (codeopolis.sellLand(8, 5)) {
            System.out.println("Land sale successful.");
        } else {
            System.out.println("Insufficient land for sale.");
        }

        // Test feedPopulation
        System.out.println("\nFeeding population...");
        if (codeopolis.feedPopulation(200)) {
            System.out.println("Population fed successfully.");
        } else {
            System.out.println("Insufficient grain to feed population.");
        }

        // Test plantCrops
        System.out.println("\nPlanting crops...");
        if (codeopolis.plantCrops(50)) {
            System.out.println("Crops planted successfully.");
        } else {
            System.out.println("Insufficient resources for planting crops.");
        }

        // Print the current status of the city
        System.out.println("\nCurrent City Status:");
        System.out.println(codeopolis.toString());
    }
}
