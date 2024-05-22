package design.patterns.decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;

    public ChocoChips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return this.iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Choco chips";
    }
}
