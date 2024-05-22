package design.patterns.strategy;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(String mode) {
        return switch (mode) {
            case "Car" -> new CarPathCalculator();
            case "Walk" -> new WalkPathCalculator();
            case "Public" -> new PublicPathCalculator();
            default -> null;
        };
    }
}
