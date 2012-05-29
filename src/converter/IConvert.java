package converter;

import plant.Plant;


public interface IConvert {
    String toString(Plant o);
    Plant fromString(String s);
}
