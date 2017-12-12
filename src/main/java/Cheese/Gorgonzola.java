package Cheese;

public class Gorgonzola extends Cheese {


    public Gorgonzola(String name, int inputStrength, String inputOrigin, double inputPrice) {
        super(name, inputStrength, inputOrigin, true, inputPrice);
    }

    public String goesOff() {
        return "I've gone brown and hard. Throw me away!";
    }
}
