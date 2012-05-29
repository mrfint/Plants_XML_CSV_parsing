package plant;

import java.io.Serializable;



public class Tree extends Plant implements Serializable{

    private float age,hightMax,diametrMax;
    private String type,region,note;
    
    public Tree(){}
    public Tree(String q1, String q2,String q3, String q4, String q5, String q6,String q7, String q8,String q9){
        setId(Integer.parseInt(q1));
        setName(q2);
        setLocation(q3);
        setAge(Float.parseFloat(q4));
        setHightMax(Float.parseFloat(q5));
        setDiametrMax(Float.parseFloat(q6));
        setType(q7);
        setRegion(q8);
        setNote(q9);  
      
    }
    
    public void setAge(float age) {
        this.age = age;
    }
    public void setDiametrMax(float diametrMax) {
        this.diametrMax = diametrMax;
    }
    public void setHightMax(float hightMax) {
        this.hightMax = hightMax;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String toString(){ 
        return "Tree: id: "+id+", name :"+name+", location: "+location+
                    ", age: "+age+", hightMax: "+hightMax+", diametrMax: "+diametrMax+
                    ", type:"+type+", region:"+region+", notes: "+note+";\r\n";}
    
    public float getAge() {
        return age;
    }

    public float getDiametrMax() {
        return diametrMax;
    }

    public float getHightMax() {
        return hightMax;
    }

    public String getNote() {
        return note;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }

    @Override 
    public boolean equals(Object o)
    {   boolean res=false;
        
        if (super.equals(o) && (o instanceof Tree)) 
        {
            Tree p = (Tree)o;
            res = p.age==age && p.diametrMax==diametrMax && p.hightMax == hightMax 
               && p.note.equals(note) && p.region.equals(region) && p.type.equals(type);
        }
        return res;
    }
}