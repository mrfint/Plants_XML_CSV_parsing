
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Plant;
import plant.Tree;


public class TreeConvertXML implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Tree t = (Tree)o; 
        sb.append("<Tree>");
            sb.append("<id>").append(t.getId()).append("</id>");
            sb.append("<name>").append(t.getName()).append("</name>");
            sb.append("<location>").append(t.getLocation()).append("</location>");
            sb.append("<age>").append(t.getAge()).append("</age>");
            sb.append("<hightMax>").append(t.getHightMax()).append("</hightMax>");
            sb.append("<diametrMax>").append(t.getDiametrMax()).append("</diametrMax>");
            sb.append("<type>").append(t.getType()).append("</type>");
            sb.append("<region>").append(t.getRegion()).append("</region>");
            sb.append("<note>").append(t.getNote()).append("</note>");
        sb.append("</Tree>\r\n");
        
        return sb.toString();
    }
       
    @Override
    public Plant fromString(String s) 
    {
       Tree t = new Tree(FindField.tagsXML(s, "id"),FindField.tagsXML(s, "name"),FindField.tagsXML(s, "location"),
               FindField.tagsXML(s, "age"),FindField.tagsXML(s, "hightMax"),FindField.tagsXML(s, "diametrMax"),
               FindField.tagsXML(s, "type"),FindField.tagsXML(s, "region"),FindField.tagsXML(s, "note"));
           
       return t;
    }
}
