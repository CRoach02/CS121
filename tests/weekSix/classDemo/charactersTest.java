package weekSix.classDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class charactersTest {
    //Create an instance of your class
    private characters charmander = new characters();

    @Test
    void setColor() {
        //success
        assertEquals("red", charmander.getColor());
    }
    void testConstructor(){
        characters flygon = new characters();
        assertNotNull(flygon);
    }

}