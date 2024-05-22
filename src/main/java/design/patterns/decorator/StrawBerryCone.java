package design.patterns.decorator;

public class StrawBerryCone implements IceCream{
    private IceCream iceCream;

    public StrawBerryCone(){
    }

    public StrawBerryCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream!=null)
            return this.iceCream.getCost() + 15;
        return 15;
    }

    @Override
    public String getDescription() {
        if(iceCream!=null)
            return iceCream.getDescription() + " StrawBerry Cone";
        return "StrawBerry Cone";
    }
}
