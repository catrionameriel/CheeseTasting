package Person;

import Cheese.Cheese;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private int age;
    private String gender;
    private ArrayList<String> favouriteFoods;

    public Person(String inputName, int inputAge, String inputGender, ArrayList<String> favouriteFoods){
        this.name = inputName;
        this.age = inputAge;
        this.gender = inputGender;
        this.favouriteFoods = favouriteFoods;
    }

    public abstract String eatCheese(Cheese cheeseName);

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
        return this.favouriteFoods.size();
    }

    public void addFoodToFavs(String food) {
        this.favouriteFoods.add(food);
    }

    public boolean likesFood(String food){
        return this.favouriteFoods.contains(food);
    }
}
