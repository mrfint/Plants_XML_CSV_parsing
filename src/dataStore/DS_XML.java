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

public class DS_XML extends ADS{

    @Override
    public void save(List<Plant> lst) throws IOException
    {
        FileWriter out = new FileWriter(super.getfName());
        out.write("<document>\r\n");
        for(int i=0; i<lst.size(); i++){
            String type = lst.get(i).getClass().getSimpleName();
            out.write(FactoryConvertI.getInstance("xml", type).toString(lst.get(i)));
        }
        out.write("</document>");
        out.close();
    }

    @Override
    public List<Plant> load() throws IOException{
        IConvert converter = null;
        BufferedReader in = new BufferedReader(new FileReader(super.getfName()));
        List<Plant> lst = new ArrayList<Plant>();
        String s;
       
        while((s=in.readLine())!=null)
        {   String type = s.substring(1,s.indexOf('>'));
            converter = FactoryConvertI.getInstance("xml", type);
            if(converter!=null) lst.add(converter.fromString(s));
        }
        in.close();  
        return lst;
    }
    
}
