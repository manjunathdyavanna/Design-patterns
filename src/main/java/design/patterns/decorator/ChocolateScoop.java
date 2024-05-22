package design.patterns.decorator;

public class ChocolateScoop implements IceCream{
    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return this.iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Chocolate scoop";
    }
}
