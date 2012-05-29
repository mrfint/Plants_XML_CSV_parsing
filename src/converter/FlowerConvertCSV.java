
package converter;

import converter.util.FindField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import plant.Flower;
import plant.Plant;
import plant.Tree;


public class FlowerConvertCSV implements IConvert{

    @Override
    public String toString(Plant o) 
    {   StringBuilder sb = new StringBuilder();
        Flower t = (Flower)o; 
        sb.append("Flower;");
            sb.append(t.getId()).append(';');
            sb.append(t.getName()).append(';');
            sb.append(t.getLocation()).append(';');
            sb.append(t.getColor()).append(';');
            sb.append(t.getStructure()).append(';');
            sb.append(t.getqPetal()).append(';');
            sb.append(t.isSpike()).append(';');
            sb.append(t.getTemperature()).append(';');
        sb.append("\r\n");
        
        return sb.toString();
    }
    
    @Override
    public Plant fromString(String s) 
    {   
        String[] q= s.split(";"); 
        Flower t = new Flower(q[1],q[2],q[3],q[4],q[5],q[6],q[7],q[8]);

       return t;
    }

}
