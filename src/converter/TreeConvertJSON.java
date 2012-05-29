
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Plant;
import plant.Tree;


public class TreeConvertJSON implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Tree t = (Tree)o; 
        sb.append("{\"Tree\": {");
            sb.append("\"id\":\"").append(t.getId()).append("\",");
            sb.append("\"name\":\"").append(t.getName()).append("\",");
            sb.append("\"location\":\"").append(t.getLocation()).append("\",");
            sb.append("\"age\":\"").append(t.getAge()).append("\",");
            sb.append("\"hightMax\":\"").append(t.getHightMax()).append("\",");
            sb.append("\"diametrMax\":\"").append(t.getDiametrMax()).append("\",");
            sb.append("\"type\":\"").append(t.getType()).append("\",");
            sb.append("\"region\":\"").append(t.getRegion()).append("\",");
            sb.append("\"note\":\"").append(t.getNote()).append("\"");
        sb.append("}\r\n");
        
        return sb.toString();
    }
       
    @Override
    public Plant fromString(String s) 
    {  
       Tree t = new Tree(FindField.tagsJSON(s, "id"),FindField.tagsJSON(s, "name"),FindField.tagsJSON(s, "location"),
               FindField.tagsJSON(s, "age"),FindField.tagsJSON(s, "hightMax"),FindField.tagsJSON(s, "diametrMax"),
               FindField.tagsJSON(s, "type"),FindField.tagsJSON(s, "region"),FindField.tagsJSON(s, "note"));
            
       return t;
    }
}
