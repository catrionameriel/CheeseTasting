package Cheese;

public abstract class Cheese {

    private String name;
    private int strength;
    private String origin;
    private boolean pasteurised;
    private double price;

    public Cheese(String name, int inputStrength, String inputOrigin, boolean isPasteurised, double inputPrice){
        this.name = name;
        this.strength = inputStrength;
        this.origin = inputOrigin;
        this.price = inputPrice;
        this.pasteurised = isPasteurised;

    }

    public abstract String goesOff();

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public String getCheeseName() {
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getOrigin(){
        return this.origin;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean getPasteurised(){
        return this.pasteurised;
    }

}
