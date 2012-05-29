package plant;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Plant 
                            implements Comparable<Plant>, Cloneable,
                                        Serializable
{
    protected int id;
    protected String location;
    protected String name;

    public int compareTo(Plant o){
            return this.id-o.id;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
   
    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override 
    public boolean equals(Object o)
    {   boolean res=false;
        
        if (o instanceof Plant) 
        {
            Plant p = (Plant)o;
            res = p.id==id && p.location.equals(location) && p.name.equals(name);
        }
        return res;
    }
}