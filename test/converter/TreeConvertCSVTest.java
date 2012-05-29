
package converter;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import plant.Tree;

public class TreeConvertCSVTest {
    TreeConvertCSV t = new TreeConvertCSV();
    Tree o1 = new Tree();

    public TreeConvertCSVTest() {
        o1 = (Tree) t.fromString("Tree;1;Dub;Ukraine;50.0;60.5;2.0;Leafy;Center;cool;");
    }
        
    @Test
    public void testFromString() {
        
        assertEquals(o1.toString(), "Tree: id: 1, name :Dub, location: Ukraine, age: 50.0, "
                    + "hightMax: 60.5, diametrMax: 2.0, type:Leafy, region:Center, notes: cool;\r\n");
    }
    @Test
    public void testToString() {
        assertEquals("Tree;1;Dub;Ukraine;50.0;60.5;2.0;Leafy;Center;cool;\r\n", t.toString(o1));
    }
}
