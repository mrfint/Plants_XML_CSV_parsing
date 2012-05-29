
package converter;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import plant.Tree;

public class TreeConvertXMLTest {
    TreeConvertXML t = new TreeConvertXML();
    Tree o1 = new Tree();

    public TreeConvertXMLTest() {
        o1 = (Tree) t.fromString("<Tree><id>1</id><name>Dub</name><location>Ukraine</location>"
                + "<age>50.0</age><hightMax>60.5</hightMax><diametrMax>2.0</diametrMax><type>Leafy</type>"
                + "<region>Center</region><note>cool</note></Tree>");
    }
        
    @Test
    public void testFromString() {
        
        assertEquals(o1.toString(), "Tree: id: 1, name :Dub, location: Ukraine, age: 50.0, "
                    + "hightMax: 60.5, diametrMax: 2.0, type:Leafy, region:Center, notes: cool;\r\n");
    }
    @Test
    public void testToString() {
        assertEquals("<Tree><id>1</id><name>Dub</name><location>Ukraine</location>"
                + "<age>50.0</age><hightMax>60.5</hightMax><diametrMax>2.0</diametrMax><type>Leafy</type>"
                + "<region>Center</region><note>cool</note></Tree>\r\n", t.toString(o1));
    }
}
