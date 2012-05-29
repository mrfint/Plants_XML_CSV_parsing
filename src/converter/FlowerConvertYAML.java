
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Flower;
import plant.Plant;
import plant.Tree;


public class FlowerConvertYAML implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Flower t = (Flower)o; 
        sb.append("***Flower*******************\r\n");
            sb.append("\t id : ").append(t.getId()).append("\r\n");
            sb.append("\t name : ").append(t.getName()).append("\r\n");
            sb.append("\t location : ").append(t.getLocation()).append("\r\n");
            sb.append("\t color : ").append(t.getColor()).append("\r\n");
            sb.append("\t structure : ").append(t.getStructure()).append("\r\n");
            sb.append("\t qpetal : ").append(t.getqPetal()).append("\r\n");
            sb.append("\t spike : ").append(t.isSpike()).append("\r\n");
            sb.append("\t temperatur : ").append(t.getTemperature()).append("\r\n");
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
      Flower t = new Flower(q[1],q[2],q[3],q[4],q[5],q[6],q[7],q[8]);
      return t;
    }

}
