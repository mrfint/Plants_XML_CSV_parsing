package converter;

import org.jdom.Element;
import plant.Plant;


public interface IConvertDomXML {
    Element toElement(Plant o);
    Plant fromElement(Element e);
}
