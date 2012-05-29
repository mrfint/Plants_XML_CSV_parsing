
package converter;

public class FactoryConvertDOMi {
        private static IConvertDomXML[] arr = null;
        public static IConvertDomXML getInstance(String type)
        {   IConvertDomXML res=null;
            if (arr==null){
                init();
            }
            if(type.equals("Tree")) res = arr[0];
            if(type.equals("Flower")) res = arr[1];
            return res;
        }
        private static void init()
        {   arr = new IConvertDomXML[2];
            
            arr[0]=new TreeConvertDomXML();
            arr[1]=new FlowerConvertDomXML();
      
        }
}
