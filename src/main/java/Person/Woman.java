package Person;

import Cheese.Cheese;

import java.util.ArrayList;

public class Woman extends Person {

    private boolean pregnancyStatus;

    public Woman(String inputName, int inputAge, String inputGender, ArrayList<Cheese> favouriteCheeses) {
        super(inputName, inputAge, inputGender, favouriteCheeses);
        this.pregnancyStatus = true;
    }

    public String eatCheese(Cheese cheese) {
        if(cheese.getPasteurised()){
            return super.eatCheese(cheese);
        }
        return "I can't eat it";
    }

    public boolean getPregnancyStatus() {
        return this.pregnancyStatus;
    }
}
