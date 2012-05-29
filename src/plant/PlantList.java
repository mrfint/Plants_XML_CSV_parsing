package plant;

import dataStore.ADS;
import dataStore.DSFactory;
import except.ExtenException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlantList{
    private List<Plant> lst;
    public PlantList(){
        lst = new ArrayList();
    }
    public void add(Plant o){
        lst.add(o);
    }
    public void sort() { 
        Collections.sort(lst);  
    }
    
    public void save() throws IOException, ExtenException {
        ADS ds = DSFactory.getInstance("xml");
        ds.setfName("1.xml");
        ds.save(lst);
    }

    public void load() throws IOException, ExtenException {
        ADS ds = DSFactory.getInstance("xml");
        ds.setfName("1.xml");
        lst = ds.load();
    }

    public int size() { return lst.size();}
    
    public List<Plant> getList(){return lst;}

    public void setLst(List<Plant> lst) {
        this.lst = lst;
    }
    
    public String toString(){ return lst.toString();}

}