package weekNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @BeforeEach
    public void setUp(){
        Car ford = new Car("Ford", "GT", 1995, 200000);
        Car porsche = new Car("Porsche", "911", 2010, 250000);

    }

    @Test
    public void testInstanceCount(){
        assertEquals(2, Car.getInstanceCount());
    }
}