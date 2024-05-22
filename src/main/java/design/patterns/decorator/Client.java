package design.patterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocoChips(
                new ChocolateScoop(
                        new StrawBerryCone(
                                new VanillaCone(
                                        new ChocolateScoop(
                                                new OrangeCone()
                                        )
                                )
                        )
                )
        );

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
