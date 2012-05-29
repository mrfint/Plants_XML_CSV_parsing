
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Plant;
import plant.Tree;


public class TreeConvertCSV implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Tree t = (Tree)o; 
        sb.append("Tree;");
            sb.append(t.getId()).append(';');
            sb.append(t.getName()).append(';');
            sb.append(t.getLocation()).append(';');
            sb.append(t.getAge()).append(';');
            sb.append(t.getHightMax()).append(';');
            sb.append(t.getDiametrMax()).append(';');
            sb.append(t.getType()).append(';');
            sb.append(t.getRegion()).append(';');
            sb.append(t.getNote()).append(';');
        sb.append("\r\n");
        
        return sb.toString();
    }
       
    @Override
    public Plant fromString(String s) 
    {
       String q[] = s.split(";");
       Tree t = new Tree(q[1],q[2],q[3],q[4],q[5],q[6],q[7],q[8],q[9]);
       
       return t;
    }
}
