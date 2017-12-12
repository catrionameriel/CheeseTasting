import Cheese.Brie;
import Cheese.Gorgonzola;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheeseTest {

    private Brie brie;
    private Gorgonzola gorgonzola;

    @Before
    public void before(){
        brie = new Brie("Brie",2, "France", 3.50);
        gorgonzola = new Gorgonzola("Gorgonzola",5, "Italy", 5.10);
    }

    @Test
    public void canGetBrieName(){
        assertEquals("Brie", brie.getCheeseName());
    }

    @Test
    public void canGetBrieStrength(){
        assertEquals(2, brie.getStrength());
    }

    @Test
    public void canGetBrieOrigin(){
        assertEquals("France", brie.getOrigin());
    }

    @Test
    public void canGetGorgonzolaPrice(){
        assertEquals(5.10, gorgonzola.getPrice(), 0.01);
    }

    @Test
    public void checkGorgonzolaIsPasteurised(){
        assertEquals(true, gorgonzola.getPasteurised());
    }

    @Test
    public void canChaneBriePrice(){
        brie.setPrice(3.70);
        assertEquals(3.70, brie.getPrice(), 0.01);
    }

    @Test
    public void brieCanGoOff(){
        assertEquals("I've gone slimy and mouldy. Throw me away!", brie.goesOff());
    }

    @Test
    public void gorgonzolaCanGoOff(){
        assertEquals("I've gone brown and hard. Throw me away!", gorgonzola.goesOff());
    }



}
