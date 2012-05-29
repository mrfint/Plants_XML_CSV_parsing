
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Plant;
import plant.Tree;


public class TreeConvertYAML implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Tree t = (Tree)o; 
        sb.append("***Tree**********************\r\n");
            sb.append("\t id : ").append(t.getId()).append("\r\n");
            sb.append("\t name : ").append(t.getName()).append("\r\n");
            sb.append("\t location : ").append(t.getLocation()).append("\r\n");
            sb.append("\t age : ").append(t.getAge()).append("\r\n");
            sb.append("\t hightMax : ").append(t.getHightMax()).append("\r\n");
            sb.append("\t diametrMax : ").append(t.getDiametrMax()).append("\r\n");
            sb.append("\t type : ").append(t.getType()).append("\r\n");
            sb.append("\t region : ").append(t.getRegion()).append("\r\n");
            sb.append("\t note : ").append(t.getNote()).append("\r\n");
        sb.append("****************************\r\n");
        
        return sb.toString();
    }
       
    @Override
    public Plant fromString(String s) 
    { 
      String[] fields = s.split("\t");
      String[] q = new String[fields.length];
      for(int i = 1; i<fields.length; i++)
      {  String[] key =fields[i].split(":");
         q[i]=key[1].trim();
      }
      Tree t = new Tree(q[1],q[2],q[3],q[4],q[5],q[6],q[7],q[8],q[9]);
           
      return t;
    }
}
