
package converter;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import plant.Flower;
import plant.Tree;

public class FlowerConvertCSVTest {
    FlowerConvertCSV t = new FlowerConvertCSV();
    Flower o1 = new Flower();

    public FlowerConvertCSVTest() {
        o1 = (Flower) t.fromString("Flower;0;Rose;Ukraine;red;purpose;12;true;30.0;\r\n");
    }
        
    @Test
    public void testFromString() {
        assertEquals(o1.toString(), "Flower: id: 0, name :Rose, location: Ukraine, color: red, structure: "
                + "purpose, qoual of petal: 12, spike:true, temperature(C):30.0;\r\n");
    }
    @Test
    public void testToString() {
        assertEquals("Flower;0;Rose;Ukraine;red;purpose;12;true;30.0;\r\n", t.toString(o1));
    }
}
