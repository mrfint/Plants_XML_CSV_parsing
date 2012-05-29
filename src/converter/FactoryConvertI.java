
package converter;

public class FactoryConvertI {
    private static IConvert[][] arr = new IConvert[][]{{new TreeConvertCSV() ,new FlowerConvertCSV()},
                                                       {new TreeConvertXML() ,new FlowerConvertXML()},
                                                       {new TreeConvertJSON(),new FlowerConvertJSON()},
                                                       {new TreeConvertYAML(),new FlowerConvertYAML()},
                                                          
                                                         };
    
    
    public static IConvert getInstance(String style, String type)
    {   
        int i=0, j=0;
        boolean f1= false, f2 = false;
        IConvert res=null;
        
        if(style.equals("csv" )) {i=0; f1=true; }
        if(style.equals("xml" )) {i=1; f1=true; }
        if(style.equals("json")) {i=2; f1=true; }
        if(style.equals("yaml")) {i=3; f1=true; }
        
        if(type.equals("Tree"))   {j=0; f2=true; }  
        if(type.equals("Flower")) {j=1; f2=true; } 
        
        if(f1&&f2) res = arr[i][j];
        
        return res;
    }
    
}
