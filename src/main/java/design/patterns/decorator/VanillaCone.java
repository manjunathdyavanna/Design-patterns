package design.patterns.decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;

    public VanillaCone(){
    }

    public VanillaCone(IceCream iceCream){
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
            return iceCream.getDescription() + " Vanilla Cone";
        return "Vanilla Cone";
    }
}
