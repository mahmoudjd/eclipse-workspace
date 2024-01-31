package hamurabi.city;

public class TurnResult {
    // Attributes
    private int population;
    private int grainForFood;
    private int cultivatedLand;
    private int yearsSinceFoundation;
    private String errorMessage;

    // Constructor for successful turn
    public TurnResult(int population, int grainForFood, int cultivatedLand, int yearsSinceFoundation) {
        this.population = population;
        this.grainForFood = grainForFood;
        this.cultivatedLand = cultivatedLand;
        this.yearsSinceFoundation = yearsSinceFoundation;
        this.errorMessage = null; // No error message for successful turn
    }

    // Constructor for turn with an error
    public TurnResult(String errorMessage) {
        this.errorMessage = errorMessage;
        // Set other attributes to default values (0) in case of error
        this.population = 0;
        this.grainForFood = 0;
        this.cultivatedLand = 0;
        this.yearsSinceFoundation = 0;
    }

    // Getter methods
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

    public String getErrorMessage() {
        return errorMessage;
    }
}

