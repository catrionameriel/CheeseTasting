package Person;

import Cheese.Cheese;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private int age;
    private String gender;
    private ArrayList<Cheese> favouriteCheeses;

    public Person(String inputName, int inputAge, String inputGender, ArrayList<Cheese> favouriteCheeses){
        this.name = inputName;
        this.age = inputAge;
        this.gender = inputGender;
        this.favouriteCheeses = favouriteCheeses;
    }

    public String eatCheese(Cheese cheeseName){
        if (this.likesCheese(cheeseName)){
            return "Nom nom";
        }
        else {
            return "Not for me";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int countFavFoods() {
        return this.favouriteCheeses.size();
    }

    public void addFoodToFavs(Cheese cheese) {
        this.favouriteCheeses.add(cheese);
    }

    public boolean likesCheese(Cheese cheese){
        return this.favouriteCheeses.contains(cheese);
    }

}
