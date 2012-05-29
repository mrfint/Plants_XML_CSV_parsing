
package converter;

import org.jdom.Element;
import plant.Flower;
import plant.Plant;

class FlowerConvertDomXML implements IConvertDomXML {

    public FlowerConvertDomXML() {
    }

    @Override
    public Element toElement(Plant o) {
        Flower t= (Flower)o;
        Element e = new Element(t.getClass().getSimpleName());        
        
        e.addContent(new Element("id").setText(""+t.getId()));
        e.addContent(new Element("name").setText(t.getName()));
        e.addContent(new Element("location").setText(t.getLocation()));
        
        e.addContent(new Element("color").setText(t.getColor()));
        e.addContent(new Element("structure").setText(t.getStructure()));
        e.addContent(new Element("qpetal").setText(""+t.getqPetal()));
        
        e.addContent(new Element("spike").setText(""+t.isSpike()));
        e.addContent(new Element("temperature").setText(""+t.getTemperature()));
        
        return e;
    }

    @Override
    public Plant fromElement(Element e) {
        Flower t = new Flower(e.getChildText("id"),e.getChildText("name"),e.getChildText("location"),
               e.getChildText("color"),e.getChildText("structure"),e.getChildText("qpetal"),
               e.getChildText("spike"),e.getChildText("temperature"));
         return t;
    }

}
