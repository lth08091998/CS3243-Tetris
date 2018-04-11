public class Config {
    // GAME SETTINGS
    // public static final int POPULATION = 1000;
    public static final int POPULATION = 100;
    public static final int NUMBER_OF_GENERATIONS = 20000;
    public static final int TURN_NUMBER_LIMIT = 500;    // Set to -1 for unlimited
    // public static final int TESTS_PER_GENERATION = 10;
    public static final int TESTS_PER_GENERATION = 5;
    public static final int NO_OF_THREADS = 100;        // MUST DIVIDE POPULATION!
    public static final boolean NEW_TRAINING_SESSION = true;
    public static final int STARTING_GENERATION = 0;

    // BREEDER SETTINGS
    public static final double SELECTION_RATE = 0.1;  // Two best genes from SELECTION_RATE * POP will be chosen to cross over
    public static final double CROSSOVER_AMOUNT = 0.1;    // KILLOFF_RATE * POP = no. of genes killed off
    public static final double CROSSOVER_RATE = 0.1;
    public static final double MUTATION_RATE = 0.1; // The probability of a gene getting a mutation
    public static final double MUTATION_AMOUNT = 0.1; // The max amount of mutation allowed

    // NOT A SETTING
    public static final int NO_OF_FEATURES = 6;
}
