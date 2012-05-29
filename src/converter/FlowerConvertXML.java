
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Flower;
import plant.Plant;
import plant.Tree;


public class FlowerConvertXML implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Flower t = (Flower)o; 
        sb.append("<Flower>");
            sb.append("<id>").append(t.getId()).append("</id>");
            sb.append("<name>").append(t.getName()).append("</name>");
            sb.append("<location>").append(t.getLocation()).append("</location>");
            sb.append("<color>").append(t.getColor()).append("</color>");
            sb.append("<structure>").append(t.getStructure()).append("</structure>");
            sb.append("<qpetal>").append(t.getqPetal()).append("</qpetal>");
            sb.append("<spike>").append(t.isSpike()).append("</spike>");
            sb.append("<temperature>").append(t.getTemperature()).append("</temperature>");
        sb.append("</Flower>\r\n");
        
        return sb.toString();
    }
    
    @Override
    public Plant fromString(String s) 
    {
       Flower t = new Flower(FindField.tagsXML(s, "id"),FindField.tagsXML(s, "name"),FindField.tagsXML(s, "location"),
                        FindField.tagsXML(s, "color"),FindField.tagsXML(s, "structure"),FindField.tagsXML(s, "qpetal"),
                        FindField.tagsXML(s, "spike"),FindField.tagsXML(s, "temperature"));

       return t;
    }

}
