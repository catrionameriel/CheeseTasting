package Cheese;

public class Brie extends Cheese {


    public Brie(String name, int inputStrength, String inputOrigin, double inputPrice) {
        super(name, inputStrength, inputOrigin, false, inputPrice);
    }


    public String goesOff() {
        return "I've gone slimy and mouldy. Throw me away!";
    }


}
