
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Flower;
import plant.Plant;
import plant.Tree;


public class FlowerConvertJSON implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Flower t = (Flower)o; 
        sb.append("{\"Flower\": {");
            sb.append("\"id\":\"").append(t.getId()).append("\",");
            sb.append("\"name\":\"").append(t.getName()).append("\",");
            sb.append("\"location\":\"").append(t.getLocation()).append("\",");
            sb.append("\"color\":\"").append(t.getColor()).append("\",");
            sb.append("\"structure\":\"").append(t.getStructure()).append("\",");
            sb.append("\"qpetal\":\"").append(t.getqPetal()).append("\",");
            sb.append("\"spike\":\"").append(t.isSpike()).append("\",");
            sb.append("\"temperature\":\"").append(t.getTemperature()).append("\"}");
        sb.append("}\r\n");
        
        return sb.toString();
    }
    
    @Override
    public Plant fromString(String s) 
    {
       Flower t = new Flower(FindField.tagsJSON(s, "id"),FindField.tagsJSON(s, "name"),FindField.tagsJSON(s, "location"),
                        FindField.tagsJSON(s, "color"),FindField.tagsJSON(s, "structure"),FindField.tagsJSON(s, "qpetal"),
                        FindField.tagsJSON(s, "spike"),FindField.tagsJSON(s, "temperature"));

       return t;
    }

}
