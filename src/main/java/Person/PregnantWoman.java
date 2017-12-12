package Person;

import Cheese.Cheese;

import java.util.ArrayList;

public class PregnantWoman extends Person {

    private boolean pregnancyStatus;

    public PregnantWoman(String inputName, int inputAge, String inputGender, ArrayList<String> favouriteFoods) {
        super(inputName, inputAge, inputGender, favouriteFoods);
        this.pregnancyStatus = true;
    }

    public String eatCheese(Cheese cheeseName) {
        if((this.likesFood("cheeseName")) && (cheeseName.getPasteurised())){
        return "Nom nom";}
        else {return "Not for me";}
    }

    public boolean getPregnancyStatus() {
        return this.pregnancyStatus;
    }
}
