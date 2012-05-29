
package dataStore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import plant.Plant;

public class DS_Mock extends ADS{
    private ArrayList<Plant> lst = null;

    @Override
    public void save(List<Plant> ls) throws IOException {
       this.lst = (ArrayList<Plant>) ((ArrayList<Plant>) ls).clone();
    }

    @Override
    public List<Plant> load() throws IOException {
        return lst;
    }
}
