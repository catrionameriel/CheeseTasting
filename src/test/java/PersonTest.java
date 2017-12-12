import Cheese.Brie;
import Cheese.Gorgonzola;
import Person.PregnantWoman;
import Person.TeenageBoy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private TeenageBoy george;
    private PregnantWoman sandra;
    private Brie brie;
    private Gorgonzola gorgonzola;

    @Before
    public void before(){
        george = new TeenageBoy("George",17, "Male", new ArrayList<>());
        sandra = new PregnantWoman("Sandra", 35, "Female", new ArrayList<>());
        brie = new Brie("Brie",2, "France", 3.50);
        gorgonzola = new Gorgonzola("Gorgonzola",5, "Italy", 5.10);
    }

    @Test
    public void canGetBoyName(){
        assertEquals("George", george.getName());
    }

    @Test
    public void canChangeName(){
        sandra.setName("Samantha");
        assertEquals("Samantha", sandra.getName());
    }

    @Test
    public void canGetBoyAge(){
        assertEquals(17, george.getAge());
    }

    @Test
    public void canChangeAge(){
        george.setAge(18);
        assertEquals(18, george.getAge());
    }

    @Test
    public void canGetSandraGender(){
        assertEquals("Female", sandra.getGender());
    }

    @Test
    public void canSetGender(){
        george.setGender("Non binary");
            assertEquals("Non binary", george.getGender());
    }

    @Test
    public void canFindOutIfPregnant(){
        assertEquals(true, sandra.getPregnancyStatus());
    }

    @Test
    public void favFoodsStartsEmpty(){
        assertEquals(0, sandra.countFavFoods());
    }

    @Test
    public void canAddToFavFoods(){
        sandra.addFoodToFavs("Apples");
        assertEquals(1, sandra.countFavFoods());
    }

    @Test
    public void personDoesLikeFood(){
        sandra.addFoodToFavs("brie");
        assertEquals(true, sandra.likesFood("brie"));
    }

    @Test
    public void personDoesNotLikeFood(){
        george.addFoodToFavs("brie");
        assertEquals(false, george.likesFood("gorgonzola"));
    }

    @Test
    public void canEatCheese(){
        george.addFoodToFavs("brie");
        assertEquals("Nom nom", george.eatCheese(brie));
    }

    @Test
    public void cannotEatCheeseIfDontLikeIt(){
        george.addFoodToFavs("brie");
        assertEquals("Not for me", george.eatCheese(gorgonzola));
    }

    @Test
    public void pregnantWomanCannotEatUnpasteurisedCheese(){
        sandra.addFoodToFavs("brie");
        assertEquals("Not for me", sandra.eatCheese(brie));
    }

    @Test
    public void pregnantWomanCanEatPasteurisedCheese(){
        sandra.addFoodToFavs("gorgonzola");
        assertEquals("Nom nom", sandra.eatCheese(gorgonzola));
    }

}
