
package converter;

import converter.util.FindField;
import org.jdom.Element;
import plant.Plant;
import plant.Tree;


class TreeConvertDomXML implements IConvertDomXML{

    @Override
    public Element toElement(Plant o) {
        Tree t= (Tree)o;
        Element e = new Element(t.getClass().getSimpleName());        
        
        e.addContent(new Element("id").setText(""+t.getId()));
        e.addContent(new Element("name").setText(t.getName()));
        e.addContent(new Element("location").setText(t.getLocation()));
        
        e.addContent(new Element("age").setText(""+t.getAge()));
        e.addContent(new Element("hightMax").setText(""+t.getHightMax()));
        e.addContent(new Element("diametrMax").setText(""+t.getDiametrMax()));
        
        e.addContent(new Element("type").setText(t.getType()));
        e.addContent(new Element("region").setText(t.getRegion()));
        e.addContent(new Element("note").setText(t.getNote()));
        
        return e;
    }

    @Override
    public Plant fromElement(Element e) {
         Tree t = new Tree(e.getChildText("id"),e.getChildText("name"),e.getChildText("location"),
               e.getChildText("age"),e.getChildText("hightMax"),e.getChildText("diametrMax"),
               e.getChildText("type"),e.getChildText("region"),e.getChildText("note"));
         return t;
    }

}
