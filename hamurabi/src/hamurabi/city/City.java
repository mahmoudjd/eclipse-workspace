package hamurabi.city;

import java.util.Random;

public class City {
	// Attributes
	private String name;
	private int bushelsOfGrain;
	private int acresOfLand;
	private int population;
	private int grainForFood;
	private int cultivatedLand;
	private int yearsSinceFoundation;

	// Constants
	public static final int GRAIN_PER_PERSON = 20;
	public static final int MAX_STARVING_PERCENTAGE = 40;
	public static final int HARVEST_FACTOR = 6;
	public static final int RAT_DAMAGE_PERCENTAGE = 25;

	// Constructor
	public City(String name) {
		this.name = name;
		this.bushelsOfGrain = 2800;
		this.acresOfLand = 1000;
		this.population = 100;
		this.grainForFood = 0;
		this.cultivatedLand = 0;
		this.yearsSinceFoundation = 0;
	}

	// Buy Land
	public boolean buyLand(int pricePerAcre, int acres) {

		int totalCost = pricePerAcre * acres;

		if (totalCost <= bushelsOfGrain) {
			bushelsOfGrain -= totalCost;
			acresOfLand += acres;
			return true;
		} else {
			return false;
		}
	}

	// Sell Land
	public boolean sellLand(int pricePerAcre, int acres) {
		if (acres <= acresOfLand) {
			bushelsOfGrain += pricePerAcre * acres;
			acresOfLand -= acres;
			return true;
		} else {
			return false;
		}
	}

	// Feed Population
	public boolean feedPopulation(int amount) {
		if (amount <= bushelsOfGrain) {
			bushelsOfGrain -= amount;
			grainForFood = amount;
			return true;
		} else {
			return false;
		}
	}

	// Plant Crops
	public boolean plantCrops(int acresToPlant) {

		if (acresToPlant <= acresOfLand && population >= acresToPlant / 10 && bushelsOfGrain >= acresToPlant) {
			cultivatedLand += acresToPlant;
			bushelsOfGrain -= acresToPlant; // Deduct the needed grain for planting
			return true;
		} else {
			return false;
		}
	}

	// Getter and Setter methods (if needed)

	public String getName() {
		return name;
	}

	public int getBushelsOfGrain() {
		return bushelsOfGrain;
	}

	public int getAcresOfLand() {
		return acresOfLand;
	}

	public int getPopulation() {
		return population;
	}

	public int getGrainForFood() {
		return grainForFood;
	}

	public int getCultivatedLand() {
		return cultivatedLand;
	}

	public int getYearsSinceFoundation() {
		return yearsSinceFoundation;
	}

	// String Representation
	@Override
	public String toString() {
		return String.format(
				"In the year %d after its foundation, %d inhabitants live in the town of %s. "
						+ "The town owns %d bushels of grain and %d acres of land.",
				yearsSinceFoundation, population, name, bushelsOfGrain, acresOfLand);
	}

	// Neue Methode zur Berechnung der Bevölkerungszunahme
    private int calculatePopulationGrowth(int starvingPopulation) {
        if (population == 0) {
            return 0;
        }

        int starvingPercentage = (starvingPopulation * 100) / population;

        if (starvingPercentage < MAX_STARVING_PERCENTAGE) {
            Random random = new Random();
            return (int) (population * (random.nextDouble() * 0.4));
        } else {
            return 0;
        }
    }

    // Neue Methode zur Berechnung der Ernterate
    private double calculateHarvestRate() {
        Random random = new Random();
        return random.nextDouble() * HARVEST_FACTOR;
    }

    // Neue Methode zur Berechnung der Ernte mit Rattenschaden
    private int calculateHarvest(int foodDistribution, int acresToPlant, double harvestRate) {
        int harvestedFood = (int) (acresToPlant * harvestRate);

        // Simulieren von Rattenschäden
        int ratDamage = (int) (harvestedFood * (RAT_DAMAGE_PERCENTAGE / 100.0));
        return harvestedFood - ratDamage;
    }

    // Die Methode runTurn wurde aktualisiert, um die neuen Methoden zu verwenden und Fehler zu beheben.
    public TurnResult runTurn(int foodDistribution, int acresToPlant) {
        if (foodDistribution < 0 || acresToPlant < 0) {
            return new TurnResult("Invalid input: foodDistribution and acresToPlant must be non-negative.");
        }

        int starvingPopulation = Math.max(0, population - foodDistribution / GRAIN_PER_PERSON);
        population -= starvingPopulation;

        int populationGrowth = calculatePopulationGrowth(starvingPopulation);
        population += populationGrowth;

        population = Math.max(0, population);

        double harvestRate = calculateHarvestRate();
        int harvestedFood = calculateHarvest(foodDistribution, acresToPlant, harvestRate);

        grainForFood = Math.min(harvestedFood, bushelsOfGrain);
        bushelsOfGrain -= grainForFood;

        cultivatedLand += acresToPlant;

        yearsSinceFoundation++;

        return new TurnResult(population, grainForFood, cultivatedLand, yearsSinceFoundation);
    }

}
