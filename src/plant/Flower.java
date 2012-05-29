package plant;

import java.io.Serializable;



public class Flower extends Plant  implements Serializable{
    private String color;
    private String structure;
    private int qPetal;
    private boolean spike;
    private float temperature;

    public Flower() {
    }

    public Flower(String q1, String q2,String q3, String q4, String q5, String q6,String q7, String q8) 
    {   setId(Integer.parseInt(q1));
        setName(q2);
        setLocation(q3);
        setColor(q4);
        setStructure(q5);
        setqPetal(Integer.parseInt(q6));
        setSpike(Boolean.parseBoolean(q7));
        setTemperature(Float.parseFloat(q8));
    }
  
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getqPetal() {
        return qPetal;
    }

    public boolean isSpike() {
        return spike;
    }

    public String getStructure() {
        return structure;
    }

    public float getTemperature() {
        return temperature;
    }
    public void setqPetal(int qPetal) {
        this.qPetal = qPetal;
    }
    public void setSpike(boolean spike) {
        this.spike = spike;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
        public String toString(){ 
            return "Flower: id: "+id+", name :"+name+", location: "+location+
                     ", color: "+color+", structure: "+structure+", qoual of petal: "+qPetal+
                     ", spike:"+spike+", temperature(C):"+temperature+";\r\n";}
       
       
}