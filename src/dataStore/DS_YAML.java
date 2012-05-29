package dataStore;

import converter.FactoryConvertI;
import converter.IConvert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import plant.Flower;
import plant.Plant;
import plant.Tree;


public class DS_YAML extends ADS{

    @Override
    public void save(List<Plant> lst) throws IOException {
        FileWriter out = new FileWriter(super.getfName());
        for(int i=0; i<lst.size(); i++){
            String type = lst.get(i).getClass().getSimpleName();
            out.write(FactoryConvertI.getInstance("yaml", type).toString(lst.get(i)));
        }
        out.close();
    }

    @Override
    public List<Plant> load() throws IOException {
     
        BufferedReader in = new BufferedReader(new FileReader(super.getfName()));
        List<Plant> lst = new ArrayList<Plant>();
        String s; StringBuilder sb = null;
        
        while((s=in.readLine())!=null)
        {   sb = new StringBuilder();
            String type = (s.charAt(3)=='F')? "Flower" : "Tree";
            s=in.readLine();
            while(s.charAt(3)!='*')  
            {    sb.append(s);
                 s=in.readLine();
            }
            
            lst.add(FactoryConvertI.getInstance("yaml", type).fromString(sb.toString()));
        }
        in.close();  
        return lst;
    }
    
}
