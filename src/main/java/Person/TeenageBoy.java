package Person;

import Cheese.Cheese;

import java.util.ArrayList;

public class TeenageBoy extends Person{


    public TeenageBoy(String inputName, int inputAge, String inputGender, ArrayList<String> favouriteFoods) {
        super(inputName, inputAge, inputGender, favouriteFoods);
    }

    public String eatCheese(Cheese cheeseName) {
        String cheese = cheeseName.toString();
        if((this.likesFood(cheese))){
            return "Nom nom";}
        else {return "Not for me";}
    }

}
